package eu.pitlap.pitlap.data.youtube.model

data class YoutubeApiResponse(
    val items: List<YoutubeVideoItem>
)

data class YoutubeVideoItem(
    val snippet: YoutubeVideoDto
)
