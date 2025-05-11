package eu.pitlap.pitlap.controllers.standings

import eu.pitlap.pitlap.service.standings.StandingsService
import eu.pitlap.pitlap.service.standings.model.ConstructorStandingModel
import eu.pitlap.pitlap.service.standings.model.DriverStandingModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema

@RestController
@RequestMapping("/standings")
@Tag(name = "Standings", description = "Endpoints to retrieve Formula 1 standings")
class StandingsController(
    private val service: StandingsService
) {

    @GetMapping("/driver")
    @Operation(
        summary = "Get driver standings",
        description = "Retrieves the current driver standings in Formula 1.",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved driver standings",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = DriverStandingModel::class))]
            ),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getDriverStandings(): ResponseWrapper<List<DriverStandingModel>> {
        return service.getDriverStandings()
    }

    @GetMapping("/constructor")
    @Operation(
        summary = "Get constructor standings",
        description = "Retrieves the current constructor standings in Formula 1.",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved constructor standings",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = ConstructorStandingModel::class))]
            ),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getConstructorStandings(): ResponseWrapper<List<ConstructorStandingModel>> {
        return service.getConstructorStandings()
    }
}
