package com.alem.vision2020.repository;

import com.alem.vision2020.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
