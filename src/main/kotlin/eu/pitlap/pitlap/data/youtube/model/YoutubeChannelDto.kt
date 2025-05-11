package eu.pitlap.pitlap.data.youtube.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "youtube_upload_ids")
data class YoutubeChannelDto(
    val channelId: String,
    val channelTitle: String,
    val uploads: String
)