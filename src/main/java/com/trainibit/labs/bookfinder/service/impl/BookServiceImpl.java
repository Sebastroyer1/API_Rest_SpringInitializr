package com.trainibit.labs.bookfinder.service.impl;

import com.trainibit.labs.bookfinder.model.Book;
import com.trainibit.labs.bookfinder.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

    private List<Book> books = new ArrayList<> (List.of(
            new Book(1, "El quijote", "Miguel Cervantes"),
            new Book(2,"Cien anios Soledad", "Garcia Marquez"),
            new Book(3, "Rayuela", "Julio Cortazar"),
            new Book(4, "Oliver Twist", "Charles Dickens")
    ));

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book getById(int id) {
    return books.stream().filter(b -> b.getId() == id).findFirst().get();
    }

    @Override
    public Book save(Book book) {
        books.add(book);
        return book;
    }
}