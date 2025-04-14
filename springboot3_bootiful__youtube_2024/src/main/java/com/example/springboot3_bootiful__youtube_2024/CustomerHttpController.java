package com.example.springboot3_bootiful__youtube_2024;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@ResponseBody
public class CustomerHttpController {
    private final CustomerRepository repository;

    public CustomerHttpController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    public Collection<Customer> customers() {
        return repository.findAll();
    }

}
