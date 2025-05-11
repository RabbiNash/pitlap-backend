package eu.pitlap.pitlap.data.youtube.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collection = "youtube_vidoes")
data class YoutubeVideoDto(
    val publishedAt: String,
    val channelId: String,
    val channelTitle: String,
    val title: String,
    val description: String,
    val thumbnails: YoutubeThumbnailDto,
    val playlistId: String,
    val position: Int,
    val resourceId: ResourceIdDto,
    val videoOwnerChannelTitle: String,
    val videoOwnerChannelId: String,
    val updatedAt: String?
)

data class YoutubeThumbnailDto (
    val default: ThumbnailDimensionsDto,
    val medium: ThumbnailDimensionsDto,
    val high: ThumbnailDimensionsDto,
    val standard: ThumbnailDimensionsDto,
    val maxres: ThumbnailDimensionsDto?
)

data class ThumbnailDimensionsDto(
    val url: String,
    val width: Int,
    val height: Int
)

data class ResourceIdDto(
    val kind: String,
    val videoId: String
)