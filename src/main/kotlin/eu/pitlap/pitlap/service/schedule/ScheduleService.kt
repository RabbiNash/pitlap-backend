package eu.pitlap.pitlap.service.schedule

import eu.pitlap.pitlap.controllers.schedule.mapper.toResponse
import eu.pitlap.pitlap.controllers.schedule.model.EventResponse
import eu.pitlap.pitlap.data.schedule.repository.ScheduleRepository
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.stereotype.Service

@Service
class ScheduleService(
    private val repository: ScheduleRepository
) {
    fun getScheduleByYear(year: String): ResponseWrapper<List<EventResponse>> {
        val schedule = repository.findByYear(year) ?: throw NoSuchElementException("No schedule found for year $year")

        return ResponseWrapper(
            success = true,
            data = schedule.map { it.toResponse() },
        )
    }
}