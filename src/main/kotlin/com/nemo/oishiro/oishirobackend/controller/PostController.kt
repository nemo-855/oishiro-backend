package com.nemo.oishiro.oishirobackend.controller

import com.nemo.oishiro.oishirobackend.model.Post
import com.nemo.oishiro.oishirobackend.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(private val postService: PostService) {
    @GetMapping("/posts")
    fun getPosts(): List<Post> {
        return postService.getPosts()
    }
}