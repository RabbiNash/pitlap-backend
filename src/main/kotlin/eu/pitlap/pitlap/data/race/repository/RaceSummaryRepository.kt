package eu.pitlap.pitlap.data.race.repository

import eu.pitlap.pitlap.data.race.model.RaceSummaryDto
import org.springframework.data.mongodb.repository.MongoRepository

interface RaceSummaryRepository: MongoRepository<RaceSummaryDto, String> {
    fun findByKey(key: String): RaceSummaryDto?
}