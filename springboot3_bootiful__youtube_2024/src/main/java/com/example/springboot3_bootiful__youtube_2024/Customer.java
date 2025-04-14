package com.example.springboot3_bootiful__youtube_2024;

import org.springframework.data.annotation.Id;

record Customer(@Id Integer id, String name) {
}
