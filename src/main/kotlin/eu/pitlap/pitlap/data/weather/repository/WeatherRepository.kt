package eu.pitlap.pitlap.data.weather.repository

import eu.pitlap.pitlap.data.weather.model.WeatherDto
import org.springframework.data.mongodb.repository.MongoRepository

interface WeatherRepository: MongoRepository<WeatherDto, String> {
    fun findByYearAndRoundAndSession(year: Int, round: Int, session: String): WeatherDto?
}