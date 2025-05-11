package eu.pitlap.pitlap.data.youtube.repository

import eu.pitlap.pitlap.data.youtube.model.YoutubeVideoDto
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface YoutubeVideoRepository: MongoRepository<YoutubeVideoDto, String> {
    fun findByChannelId(channelId: String, sort: Sort): List<YoutubeVideoDto>
    fun deleteByChannelId(channelId: String): Long
    fun findByChannelTitle(channelTitle: String, sort: Sort): List<YoutubeVideoDto>
}