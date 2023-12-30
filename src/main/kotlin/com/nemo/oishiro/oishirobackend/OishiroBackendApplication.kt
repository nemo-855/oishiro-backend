package com.nemo.oishiro.oishirobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class OishiroBackendApplication {
	@RequestMapping("/")
	fun home() = "Hello World!"
}

fun main(args: Array<String>) {
	runApplication<OishiroBackendApplication>(*args)
}