package eu.pitlap.pitlap.data.schedule.repository

import eu.pitlap.pitlap.data.schedule.model.EventDto
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ScheduleRepository: MongoRepository<EventDto, ObjectId> {
    fun findByYear(year: String): List<EventDto>?
}