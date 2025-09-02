package com.example.booklibraryapp.repository;

import com.example.booklibraryapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
