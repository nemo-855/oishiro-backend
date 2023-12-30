package com.nemo.oishiro.oishirobackend.service

import com.nemo.oishiro.oishirobackend.model.Post
import org.springframework.stereotype.Service

@Service
class PostService {
    fun getPosts(): List<Post> {
        val posts = listOf(
			Post(
				id = 1,
				deviceId = "1234567890",
				userId = 1,
				title = "タイトル",
				body = "本文",
				memo = "メモ",
				rating = 3,
				createdAt = "2019-01-01 00:00:00",
				updatedAt = "2019-01-01 00:00:00"
			)
		)
		return posts
    }
}