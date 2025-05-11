package eu.pitlap.pitlap.service.weather.model

data class WeatherModel(
    val temperature: Double,
    val humidity: Double,
    val windSpeed: Double,
    val condition: String,
    val summary: String,
    val precipitation: Double? = null,
    val aiSummary: String? = null
)
