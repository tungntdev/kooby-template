package io.github.jonaskahn.controller.users

import com.google.inject.Inject
import io.github.jonaskahn.entity.User
import io.github.jonaskahn.services.UserService
import io.jooby.annotation.GET
import io.jooby.annotation.POST
import io.jooby.annotation.Path

@Path("/users")
class UserController @Inject constructor(private val userService: UserService) {

    @POST("/register")
    fun register(request: RegisterUserRequest) {

    }

    @GET("/all")
    fun all(): List<User> {
        return userService.getAllUsers()
    }
}