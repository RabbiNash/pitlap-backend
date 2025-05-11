package eu.pitlap.pitlap.data.schedule.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("schedule")
data class EventDto(
    @Id
    val id: String? = null,
    val round: Int,
    val country: String,
    val officialEventName: String,
    val eventName: String,
    val eventFormat: String,
    val year: String,
    val session1: String,
    val session1DateUtc: String,
    val session2: String,
    val session2DateUtc: String,
    val session3: String,
    val session3DateUtc: String,
    val session4: String,
    val session4DateUtc: String,
    val session5: String,
    val session5DateUtc: String,
    val latitude: Double?,
    val longitude: Double?
)