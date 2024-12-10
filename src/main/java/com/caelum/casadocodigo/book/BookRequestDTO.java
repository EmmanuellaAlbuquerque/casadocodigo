package com.caelum.casadocodigo.book;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BookRequestDTO(

        @NotBlank
        String title,

        @NotBlank
        @Size(max = 500)
        String summary,

        @NotNull
        @DecimalMin(value = "20.00", inclusive = true)
        BigDecimal price,

        @NotBlank
        @Size(min = 10, max = 13)
        String isbn,

        @NotBlank
        String category,

        @NotBlank
        String author,

        String tableOfContents,

        @NotNull
        @Min(value = 100)
        int numberOfPages,

        @NotNull
        @Future
        LocalDateTime publicationDate


) {
        public Book toModel(){
                return new Book(title(), summary(), price(), isbn(), category(), author(), tableOfContents(), numberOfPages(), publicationDate());
        }



}
