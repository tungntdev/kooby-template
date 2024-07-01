package io.github.jonaskahn.repositories

import com.google.inject.Inject
import io.github.jonaskahn.entity.User
import jakarta.persistence.EntityManager
import java.sql.SQLException


class UserRepositoryImpl @Inject constructor(private val entityManager: EntityManager): UserRepository {

    override fun getAllUsers(): List<User> {
      return entityManager.createNativeQuery("SELECT * FROM users", User::class.java).resultList as List<User>
    }

    override fun login(username: String, password: String): User? {
        val query =
            entityManager.createNativeQuery("SELECT * FROM users WHERE name = ? AND password = ?", User::class.java)
        query.setParameter(1, username)
        query.setParameter(2, password)

        return try {
            query.singleResult as User?
        }catch (e: SQLException){
            throw e
        }
    }

    override fun getUserById(id: Int): User? {
        TODO("Not yet implemented")
    }

    override fun addUser(user: User): User {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}