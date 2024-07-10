package io.github.jonaskahn.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
open class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Column(name = "name", nullable = false, length = 50)
    open var name: String? = null

    @Column(name = "password", nullable = false, length = 1000)
    open var password: String? = null
}