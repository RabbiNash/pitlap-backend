package eu.pitlap.pitlap.repository.race

import eu.pitlap.pitlap.data.race.model.RaceSessionDto
import eu.pitlap.pitlap.data.race.model.RaceSummaryDto
import eu.pitlap.pitlap.data.race.repository.RaceSummaryRepository
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class RaceSummaryRepositoryFake: RaceSummaryRepository {

    private val sessions = mutableListOf<RaceSummaryDto>()

    fun addSession(session: RaceSummaryDto) {
        sessions.add(session)
    }

    override fun findByKey(key: String): RaceSummaryDto? {
        return sessions.find { it.key == key }
    }

    override fun <S : RaceSummaryDto?> insert(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> insert(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> findAll(example: Example<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<RaceSummaryDto?> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Iterable<String?>): List<RaceSummaryDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<RaceSummaryDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<RaceSummaryDto?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : RaceSummaryDto?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Optional<RaceSummaryDto?> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: RaceSummaryDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<String?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<RaceSummaryDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}