package io.github.jonaskahn.services

import com.google.inject.ImplementedBy
import io.github.jonaskahn.entity.User

@ImplementedBy(UserServiceImpl::class)
interface UserService {
    fun getAllUsers(): List<User>
    fun getUserById(id: Int): User?
    fun addUser(user: User): User
    fun deleteUser(id: Int): Boolean
    fun login(username: String, password: String): String
}