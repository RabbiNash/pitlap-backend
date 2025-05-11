package eu.pitlap.pitlap.controllers.youtube

import eu.pitlap.pitlap.service.youtube.YoutubeService
import eu.pitlap.pitlap.service.youtube.model.YoutubeVideoModel
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
@RequestMapping("/youtube")
@Tag(name = "YouTube Videos", description = "Endpoints to retrieve videos from a YouTube channel")
class YoutubeVideosController(
    private val service: YoutubeService
) {

    @GetMapping("/{channelTitle}")
    @Operation(
        summary = "Get videos from a specific YouTube channel",
        description = "Retrieves the list of videos from a given YouTube channel by its title.",
        parameters = [
            Parameter(name = "channelTitle", description = "The title of the YouTube channel (e.g., 'Formula 1')", example = "Formula 1")
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved videos from the specified channel",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = YoutubeVideoModel::class))]
            ),
            ApiResponse(responseCode = "404", description = "No videos found for the given channel"),
            ApiResponse(responseCode = "500", description = "Internal server error")
        ]
    )
    suspend fun getVideos(
        @PathVariable channelTitle: String,
    ): ResponseWrapper<List<YoutubeVideoModel>> {
        return service.getVideosByChannelTitle(channelTitle)
    }
}
