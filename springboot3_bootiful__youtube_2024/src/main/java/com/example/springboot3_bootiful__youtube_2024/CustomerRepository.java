package com.example.springboot3_bootiful__youtube_2024;

import org.springframework.data.repository.ListCrudRepository;

public interface CustomerRepository extends ListCrudRepository< Customer, Integer> {
}