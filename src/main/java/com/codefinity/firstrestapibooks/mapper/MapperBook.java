package com.codefinity.firstrestapibooks.mapper;

import com.codefinity.firstrestapibooks.dto.BookRequestDTO;
import com.codefinity.firstrestapibooks.dto.BookResponseDTO;
import com.codefinity.firstrestapibooks.model.Book;
import org.modelmapper.ModelMapper;

public class MapperBook {
    private static final ModelMapper mapper = new ModelMapper();

    public static Book dtoRequestToModel(BookRequestDTO dto) {
        return mapper.map(dto, Book.class);
    }

    public static BookResponseDTO modelToResponseDto(Book book) {
        return mapper.map(book, BookResponseDTO.class);
    }
}
