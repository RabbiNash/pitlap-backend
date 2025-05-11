package eu.pitlap.pitlap.repository.race

import eu.pitlap.pitlap.data.practice.model.PracticeSessionDto
import eu.pitlap.pitlap.data.race.model.RaceSessionDto
import eu.pitlap.pitlap.data.race.repository.RaceSessionRepository
import org.bson.types.ObjectId
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class RaceSessionRepositoryFake: RaceSessionRepository {
    private val sessions = mutableListOf<RaceSessionDto>()

    fun addSession(session: RaceSessionDto) {
        sessions.add(session)
    }

    override fun findByKey(key: String): RaceSessionDto? {
        return sessions.find { it.key == key }
    }

    override fun <S : RaceSessionDto?> insert(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> insert(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> findAll(example: Example<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<RaceSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Iterable<ObjectId?>): List<RaceSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<RaceSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<RaceSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSessionDto?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun findById(id: ObjectId): Optional<RaceSessionDto?> {
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

    override fun delete(entity: RaceSessionDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<ObjectId?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<RaceSessionDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}