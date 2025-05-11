package eu.pitlap.pitlap.controllers.tracks

import eu.pitlap.pitlap.service.tracks.TracksService
import eu.pitlap.pitlap.service.tracks.model.TrackModel
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
@RequestMapping("/track")
@Tag(name = "Track Information", description = "Endpoints to retrieve information about racing tracks")
class TracksController(
    private val service: TracksService
) {

    @GetMapping("/facts/{trackName}")
    @Operation(
        summary = "Get information about a specific racing track",
        description = "Retrieves facts and details about a specific racing track by its name.",
        parameters = [
            Parameter(name = "trackName", description = "The name of the racing track (e.g., Monaco)", example = "Monaco")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved track information",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = TrackModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "Track not found for the given name"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    fun getTrackInfo(
        @PathVariable trackName: String,
    ): ResponseWrapper<TrackModel> {
        return service.getTrackByName(trackName)
    }
}
