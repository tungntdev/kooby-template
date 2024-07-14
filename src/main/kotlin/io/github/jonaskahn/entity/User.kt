package io.github.jonaskahn.entity

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

@Entity
@Table(name = "users")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Column(name = "name", nullable = false, length = 50)
    open var name: String? = null


    @JsonProperty("secret")
    @Column(name = "password", nullable = false, length = 1000)
    open var password: String? = null
}