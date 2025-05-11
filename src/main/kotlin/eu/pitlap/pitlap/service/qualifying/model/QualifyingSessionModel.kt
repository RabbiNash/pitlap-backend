package eu.pitlap.pitlap.service.qualifying.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "quali_results")
data class QualifyingSessionModel(
    val key: String,
    val eventName: String,
    val results: List<QualifyingResultModel>
)

data class QualifyingResultModel(
    val teamName: String,
    val headshotUrl: String,
    val q1: String,
    val q2: String,
    val q3: String,
    val position: Int,
    val fullName: String
)
