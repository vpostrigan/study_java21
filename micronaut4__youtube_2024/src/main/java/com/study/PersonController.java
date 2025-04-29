package com.study;

import com.study.db.PersonDTO;
import com.study.db.PersonRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Optional;

@Controller("/person")
public class PersonController {
    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    /**
     * for Person with sql get * will return all columns
     * for PersonDTO with sql get * will return only PersonDTO's fields
     */
    @Get("/{name}")
    Optional<PersonDTO> find(String name) {
        return this.repository.findByName(name);
    }

}
