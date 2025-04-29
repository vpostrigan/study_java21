package com.study;

import com.study.db.PersonRepository;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;

@Singleton
public class ExampleJob {
    private final PersonRepository repository;

    private boolean paused = true;

    public ExampleJob(PersonRepository repository) {
        this.repository = repository;
    }

    @Scheduled(
            fixedRate = "5s",
            condition = "#{!this.paused}"
    )
    void run0() {
        System.out.println("Running Example Job");
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

}
