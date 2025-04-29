package com.study.db;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable.Serializable
public record PersonDTO(String name, int age) {
}
