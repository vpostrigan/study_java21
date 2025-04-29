package com.study;

import com.study.db.Person;
import com.study.db.PersonDTO;
import com.study.db.PersonRepository;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@MicronautTest
public class PersonRepositoryTest {

    @Test
    void testCrud(PersonRepository repository) {
        Person save = repository.save(new Person("John", 39));
        Assertions.assertEquals(7, repository.count());

        Assertions.assertTrue(repository.findById(save.id()).isPresent());

        Optional<PersonDTO> byName = repository.findByName(save.name());
        Assertions.assertTrue(byName.isPresent());
    }

}
