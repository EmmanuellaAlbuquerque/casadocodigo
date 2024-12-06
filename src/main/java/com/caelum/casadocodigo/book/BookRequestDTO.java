package com.caelum.casadocodigo.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BookRequestDTO(

        @NotBlank
        String title,

        String summary,

        @NotNull
        BigDecimal price,

        @NotBlank
        @Size(min = 10, max = 13)
        String isbn,

        String category,

        @NotBlank
        String author,

        String tableOfContents,

        int numberOfPages,

        @NotNull
        LocalDateTime publicationDate


) {
        public Book toModel(){
                return new Book(title(), summary(), price(), isbn(), category(), author(), tableOfContents(), numberOfPages(), publicationDate());
        }

}
