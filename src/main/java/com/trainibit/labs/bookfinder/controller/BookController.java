package com.trainibit.labs.bookfinder.controller;

import com.trainibit.labs.bookfinder.model.Book;
import com.trainibit.labs.bookfinder.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {


    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;


    @GetMapping
    public List<Book> getBooks() {
        logger.info("Get all books");
        return bookService.findAll();
    }
}