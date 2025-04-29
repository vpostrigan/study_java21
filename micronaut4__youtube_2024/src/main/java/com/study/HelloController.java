package com.study;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.RouteCondition;

@Controller("/hello")
public class HelloController {

    @Get("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    @RouteCondition("#{request.headers.get('foo') != 'bar'}")
    String sayHello(String name) {
        return "Hello " + name;
    }

}
