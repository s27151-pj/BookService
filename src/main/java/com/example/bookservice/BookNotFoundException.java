package com.example.bookservice;

public class BookNotFoundException extends RuntimeException {
    BookNotFoundException(Long id) {
        super("Could not find book with id: " + id);
    }
}
