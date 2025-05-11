package eu.pitlap.pitlap.service.race.mapper

import eu.pitlap.pitlap.data.race.model.RaceSessionDto
import eu.pitlap.pitlap.data.race.model.RaceSummaryDto
import eu.pitlap.pitlap.service.race.model.RaceResultModel
import eu.pitlap.pitlap.service.race.model.RaceSessionModel
import eu.pitlap.pitlap.service.race.model.RaceSummaryModel

fun RaceSessionDto.toSessionModel(): RaceSessionModel {
    return RaceSessionModel(
        key = key,
        results = results.map {
            RaceResultModel(
                position = it.position,
                classifiedPosition = it.classifiedPosition,
                headshotURL = it.headshotURL,
                points = it.points,
                gridPosition = it.gridPosition,
                fullName = it.fullName,
                teamName = it.teamName
            )
        },
    )
}

fun RaceSummaryDto.toSummaryModel(): RaceSummaryModel {
    return RaceSummaryModel(
        key = key,
        round = round,
        name = name,
        year = year,
        summary = summary
    )
}