package com.example.booklibraryapp.repository;

import com.example.booklibraryapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
