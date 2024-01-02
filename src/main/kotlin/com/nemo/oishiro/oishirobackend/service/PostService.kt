package com.nemo.oishiro.oishirobackend.service

import com.nemo.oishiro.oishirobackend.model.Post
import com.nemo.oishiro.oishirobackend.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {
    fun getPosts(): List<Post> {
        return postRepository.findAll()
    }
}