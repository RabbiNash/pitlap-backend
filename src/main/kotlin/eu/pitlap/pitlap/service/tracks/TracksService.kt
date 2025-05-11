package eu.pitlap.pitlap.service.tracks

import eu.pitlap.pitlap.data.tracks.repository.TrackRepository
import eu.pitlap.pitlap.service.tracks.mapper.toResponseModel
import eu.pitlap.pitlap.service.tracks.model.TrackModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.stereotype.Service

@Service
class TracksService(
    private val repository: TrackRepository
) {
    fun getTrackByName(trackName: String): ResponseWrapper<TrackModel> {
        val track = repository.findByName(trackName)
            ?: throw NoSuchElementException("No track found with name $trackName")

        return ResponseWrapper(
            success = true,
            data = track.toResponseModel()
        )
    }
}