package com.example.SpringBoot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoApplication {

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(DemoApplication::class.java, *args)
		}
	}

	@GetMapping("/")
	fun hello(@RequestParam(value = "name", defaultValue = "its working") value: String): String = String.format("Awesome!, $value")

}