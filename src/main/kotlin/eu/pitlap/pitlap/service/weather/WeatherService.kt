package eu.pitlap.pitlap.service.weather

import eu.pitlap.pitlap.data.weather.repository.WeatherRepository
import eu.pitlap.pitlap.service.weather.mapper.toResponseModel
import eu.pitlap.pitlap.service.weather.model.WeatherModel
import eu.pitlap.pitlap.wrapper.ResponseWrapper
import org.springframework.stereotype.Service

@Service
final class WeatherService(
    private val repository: WeatherRepository
) {

  fun getWeatherByYearRoundAndSession(year: Int, round: Int, session: String): ResponseWrapper<WeatherModel> {
    val weather = repository.findByYearAndRoundAndSession(year, round, session)
        ?: throw NoSuchElementException("No weather found for year $year and round $round")

    return ResponseWrapper(
        success = true,
        data = weather.toResponseModel()
    )
  }
}