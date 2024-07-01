package io.github.jonaskahn.exception

open class LogicException(message: String, cause: Throwable? = null) : RuntimeException(message, cause)