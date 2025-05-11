package eu.pitlap.pitlap.repository.standings.constructor

import eu.pitlap.pitlap.data.qualifying.model.QualifyingSessionDto
import eu.pitlap.pitlap.data.standings.model.ConstructorStandingDto
import eu.pitlap.pitlap.data.standings.repository.ConstructorStandingRepository
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class ConstructorStandingsRepositoryFake: ConstructorStandingRepository {

    private val standings = mutableListOf<ConstructorStandingDto>()

    fun addStanding(session: ConstructorStandingDto) {
        standings.add(session)
    }

    override fun <S : ConstructorStandingDto?> insert(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> insert(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> findAll(example: Example<S?>): List<S?> {
        return standings.toList() as List<S?>
    }

    override fun <S : ConstructorStandingDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<ConstructorStandingDto?> {
        return standings.toList()
    }

    override fun findAllById(ids: Iterable<String?>): List<ConstructorStandingDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<ConstructorStandingDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<ConstructorStandingDto?> {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : ConstructorStandingDto?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Optional<ConstructorStandingDto?> {
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

    override fun delete(entity: ConstructorStandingDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<String?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<ConstructorStandingDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}