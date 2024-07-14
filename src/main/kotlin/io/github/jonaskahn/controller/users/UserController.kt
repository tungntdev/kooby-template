package io.github.jonaskahn.controller.users

import com.google.inject.Inject
import io.github.jonaskahn.entity.User
import io.github.jonaskahn.services.UserService
import io.jooby.Body
import io.jooby.annotation.GET
import io.jooby.annotation.POST
import io.jooby.annotation.Path
import io.jooby.annotation.PathParam

@Path("/users")
class UserController @Inject constructor(private val userService: UserService) {

    @POST("/register")
    fun register(request: RegisterUserRequest) {
    }

    @GET("/all")
    fun all(): List<User> {
        return userService.getAllUsers()
    }

    @POST("/login")
    fun login(body: RegisterUserRequest): String? {
        return userService.login(body.name.toString(), body.password.toString())
    }

    @GET("/info/{id}")
    fun get(@PathParam("id") id: Int): User? {
        return userService.getUserById(id)
    }
}