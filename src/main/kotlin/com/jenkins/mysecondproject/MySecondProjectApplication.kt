package com.jenkins.mysecondproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySecondProjectApplication

fun main(args: Array<String>) {
	runApplication<MySecondProjectApplication>(*args)
}
