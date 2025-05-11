package eu.pitlap.pitlap.repository.practice

import eu.pitlap.pitlap.data.practice.model.PracticeSessionDto
import eu.pitlap.pitlap.data.practice.repository.PracticeSessionRepository
import org.bson.types.ObjectId
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class PracticeSessionRepositoryFake: PracticeSessionRepository {
    private val sessions = mutableListOf<PracticeSessionDto>()

    fun addSession(session: PracticeSessionDto) {
        sessions.add(session)
    }

    override fun findByYearAndRoundAndSessionName(year: Int, round: Int, sessionName: String): PracticeSessionDto? {
        return sessions.find { it.year == year && it.round == round && it.sessionName == sessionName }
    }

    override fun <S : PracticeSessionDto?> insert(entity: S & Any): S & Any {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> insert(entities: Iterable<S?>): List<S?> {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> findAll(example: Example<S?>): List<S?> {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> saveAll(entities: Iterable<S?>): List<S?> {
        throw NotImplementedError()
    }

    override fun findAll(): List<PracticeSessionDto?> {
        throw NotImplementedError()
    }

    override fun findAllById(ids: Iterable<ObjectId?>): List<PracticeSessionDto?> {
        throw NotImplementedError()
    }

    override fun findAll(sort: Sort): List<PracticeSessionDto?> {
        throw NotImplementedError()
    }

    override fun findAll(pageable: Pageable): Page<PracticeSessionDto?> {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> findOne(example: Example<S?>): Optional<S?> {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> count(example: Example<S?>): Long {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> exists(example: Example<S?>): Boolean {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        throw NotImplementedError()
    }

    override fun <S : PracticeSessionDto?> save(entity: S & Any): S & Any {
        throw NotImplementedError()
    }

    override fun findById(id: ObjectId): Optional<PracticeSessionDto?> {
        throw NotImplementedError()
    }

    override fun existsById(id: ObjectId): Boolean {
        throw NotImplementedError()
    }

    override fun count(): Long {
        throw NotImplementedError()
    }

    override fun deleteById(id: ObjectId) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: PracticeSessionDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<ObjectId?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<PracticeSessionDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}