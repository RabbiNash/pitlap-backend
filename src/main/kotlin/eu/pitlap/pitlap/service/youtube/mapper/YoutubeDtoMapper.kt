package eu.pitlap.pitlap.service.youtube.mapper

import eu.pitlap.pitlap.data.youtube.model.ThumbnailDimensionsDto
import eu.pitlap.pitlap.data.youtube.model.YoutubeVideoDto
import eu.pitlap.pitlap.service.youtube.model.ThumbnailDimensionModel
import eu.pitlap.pitlap.service.youtube.model.YoutubeThumbnailModel
import eu.pitlap.pitlap.service.youtube.model.YoutubeVideoModel

fun YoutubeVideoDto.toResponseModel() : YoutubeVideoModel {
    return YoutubeVideoModel(
        videoId = resourceId.videoId,
        title = title,
        description = description,
        publishedAt = publishedAt,
        channelTitle = channelTitle,
        playlistId = playlistId,
        position = position,
        thumbnails = YoutubeThumbnailModel(
            default = thumbnails.default.toModel(),
            medium = thumbnails.medium.toModel(),
            high = thumbnails.high.toModel(),
            standard = thumbnails.standard.toModel(),
            maxres = thumbnails.maxres?.toModel()
        ),
    )
}

fun ThumbnailDimensionsDto.toModel() : ThumbnailDimensionModel {
    return ThumbnailDimensionModel(
        url = url,
        width = width,
        height = height
    )
}