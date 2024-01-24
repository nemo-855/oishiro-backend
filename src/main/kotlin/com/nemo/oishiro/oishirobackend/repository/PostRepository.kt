package com.nemo.oishiro.oishirobackend.repository

import com.nemo.oishiro.oishirobackend.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Int>