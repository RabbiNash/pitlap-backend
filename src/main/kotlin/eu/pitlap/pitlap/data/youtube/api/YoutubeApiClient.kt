package eu.pitlap.pitlap.data.youtube.api

import eu.pitlap.pitlap.data.youtube.model.YoutubeApiResponse
import eu.pitlap.pitlap.data.youtube.model.YoutubeVideoDto
import kotlinx.coroutines.reactor.awaitSingleOrNull
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import kotlin.jvm.java

@Component
class YoutubeApiClient(
    private val webClientBuilder: WebClient.Builder,
    @Value("\${youtube.api.key}") private val apiKey: String
) {

    suspend fun getVideosFromPlaylist(playlistId: String): List<YoutubeVideoDto> {
        val response = webClientBuilder.build()
            .get()
            .uri { uriBuilder ->
                uriBuilder
                    .scheme("https")
                    .host("www.googleapis.com")
                    .path("/youtube/v3/playlistItems")
                    .queryParam("part", "snippet")
                    .queryParam("playlistId", playlistId)
                    .queryParam("maxResults", 20)
                    .queryParam("key", apiKey)
                    .build()
            }
            .retrieve()
            .bodyToMono(YoutubeApiResponse::class.java)
            .awaitSingleOrNull()

        return response?.items?.map { it.snippet } ?: emptyList()
    }

    companion object {
        private const val BASE_URL = "https://www.googleapis.com/youtube/v3/playlistItems"
    }
}
