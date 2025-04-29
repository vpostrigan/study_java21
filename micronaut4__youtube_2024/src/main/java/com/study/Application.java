package com.study;

import com.study.db.Person;
import com.study.db.PersonRepository;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }

    private final PersonRepository personRepository;

    public Application(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @EventListener
    @Transactional
    void startup(StartupEvent event) {
        personRepository.save(new Person("Fred", 30));
        personRepository.save(new Person("Bob", 35));

        personRepository.saveAll(List.of(
                personRepository.save(new Person("Fred2", 30)),
                personRepository.save(new Person("Bob2", 35))
        ));
    }

}