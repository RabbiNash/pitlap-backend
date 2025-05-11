package eu.pitlap.pitlap.data.standings.repository

import eu.pitlap.pitlap.data.standings.model.ConstructorStandingDto
import org.springframework.data.mongodb.repository.MongoRepository

interface ConstructorStandingRepository: MongoRepository<ConstructorStandingDto, String>