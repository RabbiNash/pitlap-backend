package eu.pitlap.pitlap.data.qualifying.repository

import eu.pitlap.pitlap.data.qualifying.model.QualifyingSessionDto
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface QualifyingSessionRepository: MongoRepository<QualifyingSessionDto, ObjectId> {
    fun findByKey(key: String): QualifyingSessionDto?
}