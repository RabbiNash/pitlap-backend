package eu.pitlap.pitlap.service.standings.mapper

import eu.pitlap.pitlap.data.standings.model.ConstructorStandingDto
import eu.pitlap.pitlap.data.standings.model.DriverStandingDto
import eu.pitlap.pitlap.service.standings.model.ConstructorStandingModel
import eu.pitlap.pitlap.service.standings.model.DriverStandingModel

fun DriverStandingDto.toResponseModel() : DriverStandingModel {
    return DriverStandingModel(
        driverNumber = driverNumber,
        constructorName = constructorName,
        driverId = driverId,
        familyName = familyName,
        givenName = givenName,
        points = points,
        position = position,
        positionText = positionText,
        wins = wins
    )
}

fun ConstructorStandingDto.toResponseModel() : ConstructorStandingModel {
    return ConstructorStandingModel(
        constructorId = constructorId,
        constructorName = constructorName,
        points = points,
        position = position,
        positionText = positionText,
        wins = wins
    )
}