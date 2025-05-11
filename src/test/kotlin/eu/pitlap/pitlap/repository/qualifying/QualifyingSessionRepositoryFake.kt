package eu.pitlap.pitlap.repository.qualifying

import eu.pitlap.pitlap.data.qualifying.model.QualifyingSessionDto
import eu.pitlap.pitlap.data.qualifying.repository.QualifyingSessionRepository
import eu.pitlap.pitlap.data.race.model.RaceSummaryDto
import org.bson.types.ObjectId
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class QualifyingSessionRepositoryFake: QualifyingSessionRepository {
    private val sessions = mutableListOf<QualifyingSessionDto>()

    fun addSession(session: QualifyingSessionDto) {
        sessions.add(session)
    }

    override fun findByKey(key: String): QualifyingSessionDto? {
        return sessions.find { it.key == key }
    }

    override fun <S : QualifyingSessionDto?> insert(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> insert(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> findAll(example: Example<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<QualifyingSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Iterable<ObjectId?>): List<QualifyingSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<QualifyingSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<QualifyingSessionDto?> {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : QualifyingSessionDto?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun findById(id: ObjectId): Optional<QualifyingSessionDto?> {
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

    override fun delete(entity: QualifyingSessionDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<ObjectId?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<QualifyingSessionDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}