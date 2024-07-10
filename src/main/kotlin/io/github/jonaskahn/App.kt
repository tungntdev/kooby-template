package io.github.jonaskahn

import io.github.jonaskahn.controller.users.UserController
import io.github.jonaskahn.middleware.decorate
import io.jooby.OpenAPIModule
import io.jooby.guice.GuiceModule
import io.jooby.hibernate.HibernateModule
import io.jooby.hikari.HikariModule
import io.jooby.jackson.JacksonModule
import io.jooby.kt.Kooby
import io.jooby.kt.runApp
import io.jooby.netty.NettyServer


class App : Kooby({
    plugin()
    decorate()
    routes()
})

fun Kooby.plugin() {
    install(NettyServer())
    install(OpenAPIModule())
    install(JacksonModule())
    install(HikariModule())
    install(GuiceModule())
    install(HibernateModule().scan("io.github.jonaskahn.entity"))

}

fun Kooby.routes() {
    mvc(UserController::class)
}

fun main(args: Array<String>) {
    runApp(args, ::App)
}
