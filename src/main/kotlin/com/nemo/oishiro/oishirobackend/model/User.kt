package com.nemo.oishiro.oishirobackend.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User(
    @Id
    val id: String,
    val lastName: String,
    val firstName: String,
    val email: String,
    val createdAt: String,
    val updatedAt: String
)