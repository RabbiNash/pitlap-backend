package eu.pitlap.pitlap.service.race.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("race_results")
data class RaceSessionModel(
    val key: String,
    val results: List<RaceResultModel>
)

data class RaceResultModel(
    val position: Int,
    val classifiedPosition: String,
    val headshotURL: String,
    val points: Int,
    val gridPosition: Int,
    val fullName: String,
    val teamName: String
)
