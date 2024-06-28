package com.example.bookservice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class
BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookByID(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = getBookByID(id);
        book.setTitle(bookDetails.getTitle());
        book.setCategory(bookDetails.getCategory());
        book.setPages(bookDetails.getPages());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
