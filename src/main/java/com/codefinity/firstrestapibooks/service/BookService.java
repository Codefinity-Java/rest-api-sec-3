package com.codefinity.firstrestapibooks.service;

import com.codefinity.firstrestapibooks.model.Book;
import com.codefinity.firstrestapibooks.repositroy.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Book createBook(@RequestBody Book book) {
        return bookRepository.addBook(book);
    }

    public Book updateBook(@PathVariable String id, @RequestBody Book book) {
        return bookRepository.updateBook(id, book);
    }

    public void deleteBook(@PathVariable String id) {
        bookRepository.deleteBook(id);
    }

}
