package com.zserg.flashcards

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FlashcardsApplication

fun main(args: Array<String>) {
	runApplication<FlashcardsApplication>(*args)
}
