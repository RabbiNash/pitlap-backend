package eu.pitlap.pitlap.service.race

import eu.pitlap.pitlap.data.race.repository.RaceSessionRepository
import eu.pitlap.pitlap.data.race.repository.RaceSummaryRepository
import eu.pitlap.pitlap.service.race.mapper.toSessionModel
import eu.pitlap.pitlap.service.race.mapper.toSummaryModel
import eu.pitlap.pitlap.service.race.model.RaceSessionModel
import eu.pitlap.pitlap.service.race.model.RaceSummaryModel
import org.springframework.stereotype.Service

@Service
class RaceSessionService(
    private val repository: RaceSessionRepository,
    private val summaryRepository: RaceSummaryRepository
) {

    fun fetchRaceSession(year: Int, round: Int): RaceSessionModel {
        val session = repository
            .findByKey(key = "${year}_$round") ?: throw NoSuchElementException("No Race session for year $year and round $round")

        return session.toSessionModel()
    }

    fun fetchRaceSummary(year: Int, round: Int): RaceSummaryModel {
        val summary = summaryRepository
            .findByKey(key = "${year}_$round")
            ?: throw NoSuchElementException("No summary available Race session for year $year and round $round")

        return summary.toSummaryModel()
    }
}