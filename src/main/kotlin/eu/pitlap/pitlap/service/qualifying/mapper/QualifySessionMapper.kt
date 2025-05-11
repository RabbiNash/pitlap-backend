package eu.pitlap.pitlap.service.qualifying.mapper

import eu.pitlap.pitlap.data.qualifying.model.QualifyingSessionDto
import eu.pitlap.pitlap.service.qualifying.model.QualifyingResultModel
import eu.pitlap.pitlap.service.qualifying.model.QualifyingSessionModel

fun QualifyingSessionDto.toSessionModel(): QualifyingSessionModel {
    return QualifyingSessionModel(
        key = key,
        eventName = eventName,
        results = results.map {
            QualifyingResultModel(
                teamName = it.teamName,
                headshotUrl = it.headshotUrl,
                q1 = it.q1,
                q2 = it.q2,
                q3 = it.q3,
                position = it.position,
                fullName = it.fullName
            )
        }
    )
}