package eu.pitlap.pitlap.controllers.schedule.mapper

import eu.pitlap.pitlap.controllers.schedule.model.EventResponse
import eu.pitlap.pitlap.data.schedule.model.EventDto

fun EventDto.toResponse(): EventResponse {
        return EventResponse(
            round = round,
            country = country,
            officialEventName = officialEventName,
            eventName = eventName,
            eventFormat = eventFormat,
            year = year,
            session1 = session1,
            session1DateUtc = session1DateUtc,
            session2 = session2,
            session2DateUtc = session2DateUtc,
            session3 = session3,
            session3DateUtc = session3DateUtc,
            session4 = session4,
            session4DateUtc = session4DateUtc,
            session5 = session5,
            session5DateUtc = session5DateUtc,
        )
    }