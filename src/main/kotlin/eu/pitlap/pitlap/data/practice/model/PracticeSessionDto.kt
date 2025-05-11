package eu.pitlap.pitlap.data.practice.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "practice_laps")
data class PracticeSessionDto(
    @Id
    val id: ObjectId?,
    val year: Int,
    val round: Int,
    val sessionName: String,
    val eventFormat: String,
    val laps: List<PracticeLapDto>
)