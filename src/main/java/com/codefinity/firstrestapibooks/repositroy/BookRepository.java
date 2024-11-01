package com.codefinity.firstrestapibooks.repositroy;

import com.codefinity.firstrestapibooks.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getAllBooks();

    Book addBook(Book book);

    Book updateBook(String id, Book book);

    void deleteBook(String id);
}
