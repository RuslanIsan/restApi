package com.example.RestApi

import com.example.RestApi.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class RestApiApplication {

	@GetMapping
	fun hi(): Person {
		return Person(name = "Ruslan", lastName = "Isanbaev")
	}
}

fun main(args: Array<String>) {
	runApplication<RestApiApplication>(*args)
}
