package eu.pitlap.pitlap.service.tracks.mapper

import eu.pitlap.pitlap.data.tracks.model.TrackDto
import eu.pitlap.pitlap.service.tracks.model.TrackModel

fun TrackDto.toResponseModel() : TrackModel {
    return TrackModel(
        id = circuitId,
        name = name,
        location = location.locality,
        country = location.country,
        lat = location.lat,
        long = location.lng,
        url = url,
        summary = summary
    )
}
