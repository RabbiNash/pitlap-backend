package eu.pitlap.pitlap.repository.standings.constructor

import eu.pitlap.pitlap.data.standings.model.ConstructorStandingDto
import eu.pitlap.pitlap.data.standings.model.DriverStandingDto
import eu.pitlap.pitlap.data.standings.repository.DriverStandingRepository
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class DriverStandingsRepositoryFake: DriverStandingRepository {
    private val standings = mutableListOf<DriverStandingDto>()

    fun addStanding(standing: DriverStandingDto) {
        standings.add(standing)
    }

    override fun <S : DriverStandingDto?> insert(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> insert(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> findAll(example: Example<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<DriverStandingDto?> {
        return standings.toList()
    }

    override fun findAllById(ids: Iterable<String?>): List<DriverStandingDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<DriverStandingDto?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<DriverStandingDto?> {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : DriverStandingDto?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Optional<DriverStandingDto?> {
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

    override fun delete(entity: DriverStandingDto) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<String?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<DriverStandingDto?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}