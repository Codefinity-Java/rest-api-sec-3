package com.codefinity.firstrestapibooks.service.impl;

import com.codefinity.firstrestapibooks.dto.BookRequestDTO;
import com.codefinity.firstrestapibooks.dto.BookResponseDTO;
import com.codefinity.firstrestapibooks.exception.ApiException;
import com.codefinity.firstrestapibooks.mapper.MapperBook;
import com.codefinity.firstrestapibooks.model.Book;
import com.codefinity.firstrestapibooks.repositroy.BookRepository;
import com.codefinity.firstrestapibooks.repositroy.impl.BookRepositoryImpl;
import com.codefinity.firstrestapibooks.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public List<BookResponseDTO> findAllBooks() {
        return bookRepository.getAllBooks().stream()
                .map(MapperBook::modelToResponseDto)
                .toList();
    }

    public BookResponseDTO createBook(BookRequestDTO book) {
        Book modelBook = MapperBook.dtoRequestToModel(book);
        Book repositoryBook = bookRepository.addBook(modelBook);
        return MapperBook.modelToResponseDto(repositoryBook);
    }

    public BookResponseDTO updateBook(String id,BookRequestDTO book) {
        Book modelBook = MapperBook.dtoRequestToModel(book);
        Book repositoryBook = bookRepository.updateBook(id, modelBook);

        if(repositoryBook == null) {
            throw new ApiException("Not found book by id: " + id, HttpStatus.NOT_FOUND);
        }

        return MapperBook.modelToResponseDto(repositoryBook);
    }

    public void deleteBook(String id) {
        bookRepository.deleteBook(id);
    }

}

