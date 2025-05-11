package eu.pitlap.pitlap.data.practice.repository

import eu.pitlap.pitlap.data.practice.model.PracticeSessionDto
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PracticeSessionRepository : MongoRepository<PracticeSessionDto, ObjectId> {
    fun findByYearAndRoundAndSessionName(year: Int, round: Int, sessionName: String): PracticeSessionDto?
}
