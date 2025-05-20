package com.trainibit.labs.bookfinder.service.impl;

import com.trainibit.labs.bookfinder.model.Book;
import com.trainibit.labs.bookfinder.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

    private List<Book> books = List.of(
            new Book(1, "El quijote", "Miguel Cervantes"),
            new Book(2,"Cien anios Soledad", "Garcia Marquez"),
            new Book(3, "Rayuela", "Julio Cortazar"),
            new Book(4, "Oliver Twist", "Charles Dickens")
    );

    @Override
    public List<Book> findAll() {
        return books;
    }
}