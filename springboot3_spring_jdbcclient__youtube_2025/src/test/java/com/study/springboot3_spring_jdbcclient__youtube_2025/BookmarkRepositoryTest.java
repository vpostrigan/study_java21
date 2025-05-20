package com.study.springboot3_spring_jdbcclient__youtube_2025;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@JdbcTest
@Import(BookmarkRepository.class)
@Sql("/test-data.sql")
class BookmarkRepositoryTest {
    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Test
    void findAll() {
        List<Bookmark> all = bookmarkRepository.findAll();
        assertThat(all).hasSize(4);
    }
}
