package eu.pitlap.pitlap.data.tracks.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "circuits")
data class TrackDto(
    val circuitId: String,
    val url: String,
    val name: String,
    val eventName: String,
    val location: LocationDto,
    val summary: String?,
)

data class LocationDto(
    val lat: String,
    val lng: String,
    val locality: String,
    val country: String,
)
