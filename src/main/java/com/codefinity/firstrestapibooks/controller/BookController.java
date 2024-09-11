package com.codefinity.firstrestapibooks.controller;


import com.codefinity.firstrestapibooks.dto.BookRequestDTO;
import com.codefinity.firstrestapibooks.dto.BookResponseDTO;
import com.codefinity.firstrestapibooks.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<BookResponseDTO> findAllBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping
    public BookResponseDTO createBook(@RequestBody BookRequestDTO book) {
        return bookService.createBook(book);
    }

    @PutMapping("/{id}")
    public BookResponseDTO updateBook(
            @Parameter(description = "ID книги, которую нужно обновить")
            @PathVariable String id,
            @RequestBody BookRequestDTO book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBooks(
            @Parameter(description = "ID книги, которую нужно удалить")
            @PathVariable String id) {
        bookService.deleteBook(id);
    }
}



