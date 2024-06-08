package io.github.jonaskahn.controller.users

import io.jooby.annotation.POST
import io.jooby.annotation.Path

@Path("/users")
class UserController {

    @POST("/register")
    fun register(request: RegisterUserRequest) {
    }
}