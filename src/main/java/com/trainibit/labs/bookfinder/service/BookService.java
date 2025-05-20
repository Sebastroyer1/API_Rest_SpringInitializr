package com.trainibit.labs.bookfinder.service;
import com.trainibit.labs.bookfinder.model.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book getById(int id);

    Book save(Book book);
}
