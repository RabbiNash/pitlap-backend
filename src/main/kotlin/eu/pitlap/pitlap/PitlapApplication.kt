package eu.pitlap.pitlap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PitlapApplication

fun main(args: Array<String>) {
	runApplication<PitlapApplication>(*args)
}
