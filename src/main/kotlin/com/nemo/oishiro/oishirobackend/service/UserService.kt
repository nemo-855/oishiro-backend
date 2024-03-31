package com.nemo.oishiro.oishirobackend.service

import com.nemo.oishiro.oishirobackend.model.User
import com.nemo.oishiro.oishirobackend.repository.UserRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUser(id: String): User {
        return userRepository.findById(id).getOrNull() ?: throw IllegalStateException("No User Found")
    }
}