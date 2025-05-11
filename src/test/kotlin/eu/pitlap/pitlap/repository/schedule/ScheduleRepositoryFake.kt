package eu.pitlap.pitlap.repository.schedule

import eu.pitlap.pitlap.data.practice.model.PracticeSessionDto
import eu.pitlap.pitlap.data.schedule.model.EventDto
import eu.pitlap.pitlap.data.schedule.repository.ScheduleRepository
import org.bson.types.ObjectId
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class ScheduleRepositoryFake: ScheduleRepository {
    private val events = mutableListOf<EventDto>()

    fun addEvent(event: EventDto) {
        events.add(event)
    }

    override fun findByYear(year: String): List<EventDto> {
        return events.filter { year == it.year }
    }

    override fun <S : EventDto?> insert(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> insert(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> findAll(example: Example<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<EventDto?> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Iterable<ObjectId?>): List<EventDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<EventDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<EventDto?> {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : EventDto?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun findById(id: ObjectId): Optional<EventDto?> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: ObjectId): Boolean {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: ObjectId) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: EventDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<ObjectId?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<EventDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}