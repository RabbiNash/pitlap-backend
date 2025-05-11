package eu.pitlap.pitlap.service.tracks.model

data class TrackModel (
    val id: String,
    val name: String,
    val location: String,
    val country: String,
    val lat: String,
    val long: String,
    val url: String,
    val summary: String?,
)