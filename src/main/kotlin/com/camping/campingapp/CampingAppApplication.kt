package com.camping.campingapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CampingAppApplication

fun main(args: Array<String>) {
	runApplication<CampingAppApplication>(*args)
}
