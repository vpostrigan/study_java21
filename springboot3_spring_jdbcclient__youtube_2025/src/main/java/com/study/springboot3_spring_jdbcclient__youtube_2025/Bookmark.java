package com.study.springboot3_spring_jdbcclient__youtube_2025;

import java.time.Instant;

public record Bookmark(Long id, String title, String url, Instant createdAt) {
}
