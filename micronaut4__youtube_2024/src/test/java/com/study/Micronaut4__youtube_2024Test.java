package com.study;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class Micronaut4__youtube_2024Test {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks(HelloClient client) {
        Assertions.assertTrue(application.isRunning());

        Assertions.assertEquals("Hello John", client.sayHello("John"));
    }

    @Test
    void testItWorks2(HelloClient2 client) {
        Assertions.assertTrue(application.isRunning());

        Assertions.assertEquals("Hello John", client.sayHello("John"));
    }

    @Client("/hello")
    interface HelloClient {
        @Get("/{name}")
        @Consumes(MediaType.TEXT_PLAIN)
        String sayHello(String name);
    }

    @Client("/hello2")
    interface HelloClient2 {
        @Get("/{name}")
        @Consumes(MediaType.TEXT_PLAIN)
        String sayHello(String name);
    }

}
