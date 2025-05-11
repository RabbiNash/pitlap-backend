package eu.pitlap.pitlap.service.qualifying

import eu.pitlap.pitlap.data.qualifying.repository.QualifyingSessionRepository
import eu.pitlap.pitlap.service.qualifying.mapper.toSessionModel
import eu.pitlap.pitlap.service.qualifying.model.QualifyingSessionModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.stereotype.Service

@Service
class QualifyingSessionService(
    private val repository: QualifyingSessionRepository
) {

    fun fetchSession(year: Int, round: Int): ResponseWrapper<QualifyingSessionModel> {
        val session = repository
            .findByKey(
                key = "${year}_${round}"
            )
            ?: throw NoSuchElementException("Missing qualifying session for year $year and round $round")

        return ResponseWrapper(data = session.toSessionModel(), success = true)
    }
}