package com.study;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

    @Get("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello(String name) {
        return "Hello " + name;
    }

}
