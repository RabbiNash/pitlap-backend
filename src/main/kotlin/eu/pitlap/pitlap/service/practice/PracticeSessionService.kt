package eu.pitlap.pitlap.service.practice

import eu.pitlap.pitlap.service.practice.mapper.toPracticeLap
import eu.pitlap.pitlap.service.practice.model.PracticeLapModel
import eu.pitlap.pitlap.data.practice.repository.PracticeSessionRepository
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.stereotype.Service

@Service
class PracticeSessionService(
    private val repository: PracticeSessionRepository
) {
    fun getPracticeSessionByYearRoundAndName(
        year: Int, round: Int, name: String
    ): ResponseWrapper<List<PracticeLapModel>> {
        val session = repository
            .findByYearAndRoundAndSessionName(
                year = year,
                round = round,
                sessionName = name
            )
            ?: throw NoSuchElementException("Practice session not found for year $year round $round session name $name")
        return ResponseWrapper(success = true, data = session.laps.map {
            it.toPracticeLap()
        })
    }
}
