package eu.pitlap.pitlap.controllers.schedule

import eu.pitlap.pitlap.controllers.schedule.model.EventResponse
import eu.pitlap.pitlap.service.schedule.ScheduleService
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
@RequestMapping("/schedule")
@Tag(name = "Race Schedule", description = "Endpoints to retrieve the race schedule for a specific season")
class ScheduleController(
    private val service: ScheduleService
) {

    @GetMapping("/{year}")
    @Operation(
        summary = "Get race schedule by season year",
        description = "Retrieves the complete race schedule for a specific season year.",
        parameters = [
            Parameter(name = "year", description = "The season year (e.g., 2025)", example = "2025")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved race schedule",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = EventResponse::class))]
            ),
            ApiResponse(responseCode = "404", description = "Schedule not found for the given year"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getScheduleByYear(
        @PathVariable year: String
    ): ResponseWrapper<List<EventResponse>> {
        return service.getScheduleByYear(year)
    }
}
