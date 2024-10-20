package com.hoon.cat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CatApplication

fun main(args: Array<String>) {
	runApplication<CatApplication>(*args)
}
