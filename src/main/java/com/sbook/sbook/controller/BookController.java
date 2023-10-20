package com.sbook.sbook.controller;

import com.sbook.sbook.model.Book;
import com.sbook.sbook.model.BookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book")
    public Iterable<Book> findAllEmployees() {
        return this.bookRepository.findAll();
    }

    @PostMapping("/book")
    public Book addOneEmployee(@RequestBody Book book) {
        return this.bookRepository.save(book);
    }
}
