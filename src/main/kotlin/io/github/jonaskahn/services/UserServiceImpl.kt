package io.github.jonaskahn.services

import com.google.inject.Inject
import io.github.jonaskahn.entity.User
import io.github.jonaskahn.repositories.UserRepository

class UserServiceImpl @Inject constructor (private val userRepository: UserRepository) : UserService {
    override fun getAllUsers(): List<User> {
        return userRepository.getAllUsers()
    }

    override fun getUserById(id: Int): User? {
        return userRepository.getUserById(10)
    }

    override fun addUser(user: User): User {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}