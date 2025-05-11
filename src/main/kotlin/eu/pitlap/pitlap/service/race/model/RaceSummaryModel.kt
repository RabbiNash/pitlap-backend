package eu.pitlap.pitlap.service.race.model

data class RaceSummaryModel(
    val key: String,
    val round: Int,
    val name: String,
    val year: String,
    val summary: String,
)
