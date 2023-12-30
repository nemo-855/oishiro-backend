package com.nemo.oishiro.oishirobackend.model

data class Post(
    val id: Int,
    val deviceId: String,
    val userId: Int,
    val title: String,
    val body: String,
    val memo: String,
    val rating: Int,
    val createdAt: String,
    val updatedAt: String
)