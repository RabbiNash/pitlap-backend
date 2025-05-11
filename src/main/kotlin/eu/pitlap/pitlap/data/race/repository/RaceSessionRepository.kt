package eu.pitlap.pitlap.data.race.repository

import eu.pitlap.pitlap.data.race.model.RaceSessionDto
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RaceSessionRepository: MongoRepository<RaceSessionDto, ObjectId> {
    fun findByKey(key: String): RaceSessionDto?
}