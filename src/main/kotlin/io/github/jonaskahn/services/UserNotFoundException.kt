package io.github.jonaskahn.services

import io.github.jonaskahn.exception.LogicException

class UserNotFoundException: LogicException("User not found") {
}