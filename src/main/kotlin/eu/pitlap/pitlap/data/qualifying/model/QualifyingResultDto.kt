package eu.pitlap.pitlap.data.qualifying.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("quali_results")
data class QualifyingSessionDto(
    @Id
    val id: ObjectId,
    val key: String,
    val eventName: String,
    val results: List<QualifyingResultDto>
)

data class QualifyingResultDto(
    val teamName: String,
    val headshotUrl: String,
    val q1: String,
    val q2: String,
    val q3: String,
    val position: Int,
    val fullName: String
)
