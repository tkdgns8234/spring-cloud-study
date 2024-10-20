package com.hoon.butler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ButlerApplication

fun main(args: Array<String>) {
	runApplication<ButlerApplication>(*args)
}
