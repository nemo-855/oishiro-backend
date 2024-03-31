package com.nemo.oishiro.oishirobackend.model
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Post(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val deviceId: String,
    val userId: String,
    val title: String,
    val body: String,
    val memo: String,
    val rating: Int,
    val createdAt: String,
    val updatedAt: String
)