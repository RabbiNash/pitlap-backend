package eu.pitlap.pitlap.controllers.weather

import eu.pitlap.pitlap.service.weather.WeatherService
import eu.pitlap.pitlap.service.weather.model.WeatherModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema

@RestController
@RequestMapping("/weather")
@Tag(name = "Weather Information", description = "Endpoints to retrieve weather information for a specific race session")
class WeatherController(
    private val service: WeatherService
) {

    @GetMapping("/{year}/{round}/{session}")
    @Operation(
        summary = "Get weather information for a specific race session",
        description = "Retrieves weather data for a particular year, round, and session (e.g., Practice, Qualifying, Race).",
        parameters = [
            Parameter(name = "year", description = "The season year (e.g., 2025)", example = "2025"),
            Parameter(name = "round", description = "The race round number (e.g., 1 for Australian GP)", example = "1"),
            Parameter(name = "session", description = "The session type (e.g., Practice, Qualifying, Race)", example = "Practice")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved weather information for the session",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = WeatherModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Weather information not found for the specified session"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getSessionWeather(
        @PathVariable year: Int,
        @PathVariable round: Int,
        @PathVariable session: String
    ): ResponseWrapper<WeatherModel> {
        return service.getWeatherByYearRoundAndSession(year = year, round = round, session = session)
    }
}
