package eu.pitlap.pitlap.service.practice.mapper

import eu.pitlap.pitlap.service.practice.model.PracticeLapModel
import eu.pitlap.pitlap.data.practice.model.PracticeLapDto

fun PracticeLapDto.toPracticeLap() : PracticeLapModel {
    return PracticeLapModel(
        driver = driver,
        headshotUrl = headshotUrl,
        compound = compound,
        lapTime = lapTime,
        lapNumber = lapNumber,
        isPersonalBest = isPersonalBest,
        fullName = fullName
    )
}