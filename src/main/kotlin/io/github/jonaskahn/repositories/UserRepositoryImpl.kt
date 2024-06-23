package io.github.jonaskahn.repositories

import com.google.inject.Inject
import io.github.jonaskahn.entity.User
import jakarta.persistence.EntityManager


class UserRepositoryImpl @Inject constructor(private val entityManager: EntityManager): UserRepository {

    override fun getAllUsers(): List<User> {
      return entityManager.createNativeQuery("SELECT * FROM users", User::class.java).resultList as List<User>
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