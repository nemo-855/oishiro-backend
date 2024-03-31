package com.nemo.oishiro.oishirobackend.repository

import com.nemo.oishiro.oishirobackend.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String>