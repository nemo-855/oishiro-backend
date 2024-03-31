package com.nemo.oishiro.oishirobackend.controller

import com.nemo.oishiro.oishirobackend.model.User
import com.nemo.oishiro.oishirobackend.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {
    @GetMapping("/users/{userId}")
    fun getUser(@PathVariable userId: String): User {
        return userService.getUser(id = userId)
    }
}
