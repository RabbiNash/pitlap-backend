package eu.pitlap.pitlap.service.weather.mapper

import eu.pitlap.pitlap.data.weather.model.WeatherDto
import eu.pitlap.pitlap.service.weather.model.WeatherModel

fun WeatherDto.toResponseModel(): WeatherModel {
    return WeatherModel(
        temperature = temperature,
        humidity = humidity,
        windSpeed = windSpeed,
        condition = condition,
        summary = summary,
        precipitation = precipitation,
        aiSummary = aiSummary
    )
}