package eu.pitlap.pitlap.service.standings

import eu.pitlap.pitlap.data.standings.model.ConstructorStandingDto
import eu.pitlap.pitlap.data.standings.model.DriverStandingDto
import eu.pitlap.pitlap.repository.standings.constructor.ConstructorStandingsRepositoryFake
import eu.pitlap.pitlap.repository.standings.constructor.DriverStandingsRepositoryFake
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class StandingsServiceTest {

    private lateinit var driverStandingRepository: DriverStandingsRepositoryFake
    private lateinit var constructorStandingRepository: ConstructorStandingsRepositoryFake
    private lateinit var service: StandingsService

    @BeforeEach
    fun setup() {
        driverStandingRepository = DriverStandingsRepositoryFake()
        constructorStandingRepository = ConstructorStandingsRepositoryFake()
        service = StandingsService(driverStandingRepository, constructorStandingRepository)
    }

    @Test
    fun `getDriverStandings returns data successfully`() {
        driverStandingRepository
            .addStanding(
                DriverStandingDto(
                    driverId = "1",
                    points = 100,
                    driverNumber = 4,
                    constructorName = "mercedes",
                    familyName = "Hamilton",
                    givenName = "Lewis",
                    position = "5",
                    positionText = "5",
                    wins = 0,
                )
            )

        val response = service.getDriverStandings()

        assertTrue(response.success)
        assertEquals(1, response.data?.size)
        assertEquals("1", response.data?.first()?.driverId)
    }

    @Test
    fun `getDriverStandings throws exception when empty`() {
        val exception = assertThrows<NoSuchElementException> {
            service.getDriverStandings()
        }

        assertEquals("No driver standings found", exception.message)
    }

    @Test
    fun `getConstructorStandings returns data successfully`() {
        constructorStandingRepository.addStanding(
            ConstructorStandingDto(
                constructorId = "mercedes",
                points = 100,
                position = 1,
                positionText = "1",
                wins = 5,
                constructorName = "Mercedes",
            )
        )

        val response = service.getConstructorStandings()

        assertTrue(response.success)
        assertEquals(1, response.data?.size)
        assertEquals("mercedes", response.data?.first()?.constructorId)
    }

    @Test
    fun `getConstructorStandings throws exception when empty`() {
        val exception = assertThrows<NoSuchElementException> {
            service.getConstructorStandings()
        }

        assertEquals("No driver standings found", exception.message)
    }
}
