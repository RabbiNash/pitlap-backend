package eu.pitlap.pitlap.controllers.qualifying

import eu.pitlap.pitlap.service.qualifying.QualifyingSessionService
import eu.pitlap.pitlap.service.qualifying.model.QualifyingSessionModel
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
@RequestMapping("/quali")
@Tag(name = "Race Weekend", description = "Endpoints to retrieve F1 Race weekend data")
class QualifyingSessionController(
    private val service: QualifyingSessionService
) {

    @GetMapping("/convectional/{year}/{round}")
    @Operation(
        summary = "Get qualifying session details by year and round",
        description = "Retrieves details of a specific qualifying session based on the season year and round number.",
        parameters = [
            Parameter(name = "year", description = "Season year (e.g., 2025)", example = "2025"),
            Parameter(name = "round", description = "Round number within the season (e.g., 3)", example = "3")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved qualifying session data",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = QualifyingSessionModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Qualifying session not found for the given year and round"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getQualifyingSession(
        @PathVariable year: Int,
        @PathVariable round: Int
    ): ResponseWrapper<QualifyingSessionModel> {
        return service.fetchSession(
            year = year,
            round = round
        )
    }
}
