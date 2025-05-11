package eu.pitlap.pitlap.service.schedule

import eu.pitlap.pitlap.data.schedule.model.EventDto
import eu.pitlap.pitlap.repository.schedule.ScheduleRepositoryFake
import kotlin.test.Test
import kotlin.test.assertEquals

class ScheduleServiceControllerTest {

    @Test
    fun `should return events when found`() {
        // ARRANGE
        val repository = ScheduleRepositoryFake()
        val service = ScheduleService(repository = repository)
        val year = "2025"

        val event = EventDto(
            id = null,
            round = 1,
            country = "Zimbabwe",
            officialEventName = "Harare Grand Prix",
            eventName = "Harare Grand Prix",
            eventFormat = "sprint",
            year = "2025",
            session1 = "",
            session1DateUtc = "",
            session2 = "",
            session2DateUtc = "",
            session3 = "",
            session3DateUtc = "",
            session4 = "",
            session4DateUtc = "",
            session5 = "",
            session5DateUtc = "",
            latitude = null,
            longitude = null
        )

        repository.addEvent(event)

        // ACT
        val response = service.getScheduleByYear(year)

        // ASSERT
        assertEquals(1, response.data?.size)
        assertEquals(event.officialEventName, response.data?.first()?.officialEventName)
    }
}