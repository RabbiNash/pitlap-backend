package eu.pitlap.pitlap.data.practice.model

data class PracticeLapDto(
    val driver: String,
    val headshotUrl: String,
    val compound: String,
    val lapTime: String,
    val lapNumber: Int,
    val isPersonalBest: Boolean,
    val fullName: String
)
