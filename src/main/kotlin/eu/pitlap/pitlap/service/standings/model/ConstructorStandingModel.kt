package eu.pitlap.pitlap.service.standings.model

data class ConstructorStandingModel (
    val constructorId: String,
    val constructorName: String,
    val points: Int,
    val position: Int,
    val positionText: String,
    val wins: Int
)