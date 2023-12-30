package com.nemo.oishiro.oishirobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OishiroBackendApplication

fun main(args: Array<String>) {
    runApplication<OishiroBackendApplication>(*args)
}