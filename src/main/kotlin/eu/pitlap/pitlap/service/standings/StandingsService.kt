package eu.pitlap.pitlap.service.standings

import eu.pitlap.pitlap.data.standings.repository.ConstructorStandingRepository
import eu.pitlap.pitlap.data.standings.repository.DriverStandingRepository
import eu.pitlap.pitlap.service.standings.mapper.toResponseModel
import eu.pitlap.pitlap.service.standings.model.ConstructorStandingModel
import eu.pitlap.pitlap.service.standings.model.DriverStandingModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.stereotype.Service

@Service
class StandingsService(
    private val driverStandingRepository: DriverStandingRepository,
    private val constructorStandingRepository: ConstructorStandingRepository,
) {

    fun getDriverStandings(): ResponseWrapper<List<DriverStandingModel>> {
        val standings = driverStandingRepository.findAll()

        if (standings.isEmpty()) {
            throw NoSuchElementException("No driver standings found")
        }

        return ResponseWrapper(
            success = true,
            data = standings.map { it.toResponseModel() },
        )
    }

    fun getConstructorStandings(): ResponseWrapper<List<ConstructorStandingModel>> {
        val standings = constructorStandingRepository.findAll()

        if (standings.isEmpty()) {
            throw NoSuchElementException("No driver standings found")
        }

        return ResponseWrapper(
            success = true,
            data = standings.map { it.toResponseModel() },
        )
    }
}