package io.github.jonaskahn.repositories

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.google.inject.Inject
import io.github.jonaskahn.entity.User
import io.github.jonaskahn.exception.LogicException
import io.github.jonaskahn.services.UserNotFoundException
import jakarta.persistence.EntityManager
import org.hibernate.exception.SQLGrammarException

import java.sql.SQLException
import java.util.*


class UserRepositoryImpl @Inject constructor(private val entityManager: EntityManager): UserRepository  {


    override fun getAllUsers(): List<User> {
        return entityManager.createNativeQuery("SELECT * FROM users ORDER BY ID DESC LIMIT 100", User::class.java).resultList as List<User>
    }

    override fun login(username: String, password: String): String? {
        val query =
            entityManager.createNativeQuery("SELECT * FROM users WHERE name = ? AND password = ?", User::class.java)
        query.setParameter(1, username)
        query.setParameter(2, password)

        try {
            val result = query.resultList
            if(result.isEmpty()){
                return null
            }
            val user = result.first() as User
            return user.name?.let { generateToken(it) }.toString()
        }catch (e: SQLGrammarException){
            throw LogicException("Database error occurred", e)
        }catch (e: Exception) {
            throw LogicException("An unexpected error occurred", e)
        }
    }

    private fun generateToken(username: String): String {
        val algorithm = Algorithm.HMAC256("secret")
        val token = JWT.create()
            .withIssuer("auth0")
            .withClaim("username", username)
            .withExpiresAt(Date(System.currentTimeMillis() + 3600 * 1000)) // Token sẽ hết hạn sau 1 giờ
            .sign(algorithm)
        return token
    }

    override fun getUserById(id: Int): User? {
        return null
    }

    override fun addUser(user: User): User {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}