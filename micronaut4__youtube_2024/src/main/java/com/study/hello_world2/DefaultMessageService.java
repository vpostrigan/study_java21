package com.study.hello_world2;

import jakarta.inject.Singleton;

@Singleton
public class DefaultMessageService implements MessageService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
