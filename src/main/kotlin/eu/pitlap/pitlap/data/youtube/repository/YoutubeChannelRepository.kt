package eu.pitlap.pitlap.data.youtube.repository

import eu.pitlap.pitlap.data.youtube.model.YoutubeChannelDto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface YoutubeChannelRepository: MongoRepository<YoutubeChannelDto, String> {
    fun findByChannelId(channelId: String): YoutubeChannelDto?
    fun findByChannelTitle(channelTitle: String): YoutubeChannelDto?
}