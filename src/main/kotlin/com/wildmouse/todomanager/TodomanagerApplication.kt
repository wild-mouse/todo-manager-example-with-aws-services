package com.wildmouse.todomanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodomanagerApplication

fun main(args: Array<String>) {
	runApplication<TodomanagerApplication>(*args)
}
