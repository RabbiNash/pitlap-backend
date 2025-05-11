package eu.pitlap.pitlap.data.weather.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "weather")
data class WeatherDto (
    val year: Int,
    val round: Int,
    val session: String,
    val temperature: Double,
    val humidity: Double,
    val windSpeed: Double,
    val condition: String,
    val summary: String,
    val precipitation: Double?,
    val aiSummary: String?
)