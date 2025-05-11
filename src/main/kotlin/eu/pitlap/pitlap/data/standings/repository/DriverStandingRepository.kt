package eu.pitlap.pitlap.data.standings.repository

import eu.pitlap.pitlap.data.standings.model.DriverStandingDto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DriverStandingRepository: MongoRepository<DriverStandingDto, String>