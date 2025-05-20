package com.trainibit.labs.bookfinder.controller;

import com.trainibit.labs.bookfinder.model.Book;
import com.trainibit.labs.bookfinder.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {


    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    // GET /api/v1/books
    @GetMapping
    public List<Book> getBooks() {
        logger.info("Get all books");
        return bookService.findAll();
    }

    // GET /api/v1/books/{id}
    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        logger.info("Get book by id {}", id);
        return bookService.getById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        logger.info("Libro guardado {}", book);
        return bookService.save(book);
    }


}