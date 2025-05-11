package eu.pitlap.pitlap.service.practice

import eu.pitlap.pitlap.data.practice.model.PracticeLapDto
import eu.pitlap.pitlap.data.practice.model.PracticeSessionDto
import eu.pitlap.pitlap.repository.practice.PracticeSessionRepositoryFake
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PracticeSessionServiceTest {

    private val fakeRepository = PracticeSessionRepositoryFake()
    private val service = PracticeSessionService(fakeRepository)

    @Test
    fun `should return laps when session is found`() {
        val year = 2025
        val round = 3
        val name = "Practice 3"

        val lapDto = PracticeLapDto(
            driver = "VER",
            headshotUrl = "https://example.com/ver.png",
            compound = "Soft",
            lapTime = "1:22.345",
            lapNumber = 10,
            isPersonalBest = true,
            fullName = "Max Verstappen"
        )

        val sessionDto = PracticeSessionDto(
            id = null,
            year = year,
            round = round,
            sessionName = name,
            eventFormat = "Standard",
            laps = listOf(lapDto)
        )

        fakeRepository.addSession(sessionDto)

        val response = service.getPracticeSessionByYearRoundAndName(year, round, name)

        assertEquals(true, response.success)
        assertEquals(1, response.data?.size)
        assertEquals("Max Verstappen", response.data?.first()?.fullName)
    }

    @Test
    fun `should throw NoSuchElementException when session is not found`() {
        Assertions.assertThrows (NoSuchElementException::class.java) {
            service.getPracticeSessionByYearRoundAndName(2025, 5, "Practice 1")
        }
    }
}