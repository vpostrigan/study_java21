package com.study.db;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;

@MappedEntity
@Serdeable.Serializable
public record Person(
        @GeneratedValue @Id Long id,
        String name,
        int age
) {
    public Person(String name, int age) {
        this(null, name, age);
    }
}
