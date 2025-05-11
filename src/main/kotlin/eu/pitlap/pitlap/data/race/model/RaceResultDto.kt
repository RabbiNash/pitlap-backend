package eu.pitlap.pitlap.data.race.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("race_results")
data class RaceSessionDto(
    val key: String,
    val results: List<RaceResultDto>
)

data class RaceResultDto(
    val position: Int,
    val classifiedPosition: String,
    val headshotURL: String,
    val points: Int,
    val gridPosition: Int,
    val fullName: String,
    val teamName: String
)
