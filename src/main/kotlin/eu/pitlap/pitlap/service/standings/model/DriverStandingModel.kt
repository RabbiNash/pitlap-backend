package eu.pitlap.pitlap.service.standings.model

data class DriverStandingModel(
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
