package eu.pitlap.pitlap.controllers.practice

import eu.pitlap.pitlap.service.practice.model.PracticeLapModel
import eu.pitlap.pitlap.service.practice.PracticeSessionService
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
@RequestMapping("/practice")
@Tag(name = "Race Weekend", description = "Endpoints to retrieve F1 Race weekend data")
class PracticeSessionController(
    private val service: PracticeSessionService
) {

    @GetMapping("/{year}/{round}/{name}")
    @Operation(
        summary = "Get practice session laps by year, round, and session name",
        description = "Retrieves a list of lap data for a specific Formula 1 practice session, identified by year, round number, and session name (e.g., FP1, FP2, FP3).",
        parameters = [
            Parameter(name = "year", description = "Season year", example = "2025"),
            Parameter(name = "round", description = "Race round number in the season", example = "3"),
            Parameter(name = "name", description = "Practice session name (FP1, FP2, FP3)", example = "FP1")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved practice lap data",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = PracticeLapModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Session not found"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getPracticeSessionByYearRoundAndName(
        @PathVariable year: Int,
        @PathVariable round: Int,
        @PathVariable name: String
    ): ResponseWrapper<List<PracticeLapModel>> {
        return service.getPracticeSessionByYearRoundAndName(
            year = year,
            round = round,
            name = name
        )
    }
}
