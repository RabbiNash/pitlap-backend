package eu.pitlap.pitlap.data.tracks.repository

import eu.pitlap.pitlap.data.tracks.model.TrackDto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TrackRepository: MongoRepository<TrackDto, String> {
    fun findByName(name: String): TrackDto?
}