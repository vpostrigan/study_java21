package com.study.db;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;

@JdbcRepository(dialect = Dialect.MYSQL)
public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findByAgeGreaterThan(int age);

    Person findByNameLike(String name);

    int findAgeByNameLike(String name);

    @Query("select name,age from person where name = :name")
    Optional<PersonDTO> findByName(String name);
}
