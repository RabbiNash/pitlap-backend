package eu.pitlap.pitlap.data.standings.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("driver_standings")
data class DriverStandingDto(
    val driverNumber: Int,
    val constructorName: String,
    val driverId: String,
    val familyName: String,
    val givenName: String,
    val points: Int,
    val position: String,
    val positionText: String,
    val wins: Int
)
