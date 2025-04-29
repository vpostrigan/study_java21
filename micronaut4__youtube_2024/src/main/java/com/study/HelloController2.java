package com.study;

import com.study.hello_world2.MessageService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello2")
public class HelloController2 {
    private final MessageService messageService;

    public HelloController2(MessageService messageService) {
        this.messageService = messageService;
    }

    @Get("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello(String name) {
        return this.messageService.sayHello(name);
    }

}
