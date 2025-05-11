package eu.pitlap.pitlap.controllers.race

import eu.pitlap.pitlap.service.race.RaceSessionService
import eu.pitlap.pitlap.service.race.model.RaceSessionModel
import eu.pitlap.pitlap.service.race.model.RaceSummaryModel
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
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/race")
@Tag(name = "Race Sessions", description = "Endpoints to retrieve F1 race session data")
class RaceSessionController(
    private val service: RaceSessionService
) {

    @GetMapping("/result/convectional/{year}/{round}")
    @Operation(
        summary = "Get conventional race session result by year and round",
        description = "Retrieves the result of a conventional race session based on the season year and round number.",
        parameters = [
            Parameter(name = "year", description = "Season year (e.g., 2025)", example = "2025"),
            Parameter(name = "round", description = "Round number within the season (e.g., 3)", example = "3")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved conventional race session result",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = RaceSessionModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Race session not found for the given year and round"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getRaceSession(
        @PathVariable year: Int,
        @PathVariable round: Int
    ): ResponseWrapper<RaceSessionModel> {
        return ResponseWrapper(
            success = true,
            data = service.fetchRaceSession(year = year, round = round)
        )
    }

    @GetMapping("/result/sprint/{year}/{round}")
    @Operation(
        summary = "Get sprint race session result by year and round",
        description = "Retrieves the result of a sprint race session based on the season year and round number.",
        parameters = [
            Parameter(name = "year", description = "Season year (e.g., 2025)", example = "2025"),
            Parameter(name = "round", description = "Round number within the season (e.g., 3)", example = "3")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved sprint race session result",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = RaceSessionModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Sprint race session not found for the given year and round"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getSprintRaceSession(
        @PathVariable year: Int,
        @PathVariable round: Int
    ): ResponseWrapper<RaceSessionModel> {
        return ResponseWrapper(
            success = true,
            data = service.fetchRaceSession(year = year, round = round)
        )
    }

    @GetMapping("/summary/{year}/{round}")
    @Operation(
        summary = "Get race summary by year and round",
        description = "Retrieves a summary of the race session, including key results and highlights.",
        parameters = [
            Parameter(name = "year", description = "Season year (e.g., 2025)", example = "2025"),
            Parameter(name = "round", description = "Round number within the season (e.g., 3)", example = "3")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved race session summary",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = RaceSummaryModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Race summary not found for the given year and round"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getRaceSummary(
        @PathVariable year: Int,
        @PathVariable round: Int
    ): ResponseWrapper<RaceSummaryModel> {
        return ResponseWrapper(
            success = true,
            data = service.fetchRaceSummary(year = year, round = round)
        )
    }
}
