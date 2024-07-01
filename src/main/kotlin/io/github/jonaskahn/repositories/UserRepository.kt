package io.github.jonaskahn.repositories

import com.google.inject.ImplementedBy
import io.github.jonaskahn.entity.User

@ImplementedBy(UserRepositoryImpl::class)
interface UserRepository {
    fun getAllUsers(): List<User>
    fun getUserById(id: Int): User?
    fun addUser(user: User): User
    fun deleteUser(id: Int): Boolean
    fun login(username: String, password: String): User?
}