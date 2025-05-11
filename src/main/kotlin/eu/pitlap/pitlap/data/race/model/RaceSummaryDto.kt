package eu.pitlap.pitlap.data.race.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("race_summaries")
data class RaceSummaryDto(
    val key: String,
    val round: Int,
    val name: String,
    val year: String,
    val summary: String,
)
