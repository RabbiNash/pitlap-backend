package eu.pitlap.pitlap.service.youtube

import eu.pitlap.pitlap.data.youtube.api.YoutubeApiClient
import eu.pitlap.pitlap.data.youtube.repository.YoutubeChannelRepository
import eu.pitlap.pitlap.data.youtube.repository.YoutubeVideoRepository
import eu.pitlap.pitlap.service.youtube.mapper.toResponseModel
import eu.pitlap.pitlap.service.youtube.model.YoutubeVideoModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import java.time.Duration
import java.time.Instant

@Service
class YoutubeService(
    private val videoRepository: YoutubeVideoRepository,
    private val channelRepository: YoutubeChannelRepository,
    private val youtubeClient: YoutubeApiClient,
) {

    suspend fun getVideosByChannelTitle(channelTitle: String): ResponseWrapper<List<YoutubeVideoModel>> {
        val channel = channelRepository.findByChannelTitle(channelTitle)
            ?: throw NoSuchElementException("No channel found with title $channelTitle")

        var videos =  videoRepository.findByChannelId(
            channelId = channel.channelId,
            sort = Sort.by("publishedAt").descending()
        )

        val updatedAtInstant = Instant.parse(videos.first().updatedAt)
        val isStale = videos.isEmpty() || Duration.between(updatedAtInstant, Instant.now()).seconds >= 1800

        if (isStale) {
            val apiVideos = youtubeClient.getVideosFromPlaylist(channel.uploads)

            if (apiVideos.isEmpty()) {
                throw NoSuchElementException("No videos found for channel $channelTitle")
            }

            videoRepository.deleteByChannelId(channel.channelId)
            val entities = apiVideos
            videoRepository.saveAll(entities)

            videos = videoRepository.findByChannelId(
                channelId = channel.channelId,
                sort = Sort.by("publishedAt").descending()
            )
        }

        return ResponseWrapper(
            success = true,
            data = videos.map { it.toResponseModel() }
        )
    }
}