package com.codefinity.firstrestapibooks.service;

import com.codefinity.firstrestapibooks.dto.BookRequestDTO;
import com.codefinity.firstrestapibooks.dto.BookResponseDTO;

import java.util.List;

public interface BookService {
    List<BookResponseDTO> findAllBooks();

    BookResponseDTO createBook(BookRequestDTO book);

    BookResponseDTO updateBook(String id, BookRequestDTO book);

    void deleteBook(String id);
}
