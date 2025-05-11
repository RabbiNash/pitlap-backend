package eu.pitlap.pitlap.service.youtube.model

import eu.pitlap.pitlap.data.youtube.model.ResourceIdDto

data class YoutubeVideoModel(
    val publishedAt: String,
    val channelTitle: String,
    val title: String,
    val description: String,
    val thumbnails: YoutubeThumbnailModel,
    val playlistId: String,
    val position: Int,
    val videoId: String,
)

data class YoutubeThumbnailModel (
    val default: ThumbnailDimensionModel,
    val medium: ThumbnailDimensionModel,
    val high: ThumbnailDimensionModel,
    val standard: ThumbnailDimensionModel,
    val maxres: ThumbnailDimensionModel?
)

data class ThumbnailDimensionModel(
    val url: String,
    val width: Int,
    val height: Int
)