package eu.pitlap.pitlap.data.standings.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "constructor_standings")
data class ConstructorStandingDto (
    val position: Int,
    val positionText: String,
    val constructorId: String,
    val constructorName: String,
    val points: Int,
    val wins: Int,
)