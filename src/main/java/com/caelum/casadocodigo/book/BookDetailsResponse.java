package com.caelum.casadocodigo.book;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BookDetailsResponse(
        String title,

        String summary,

        BigDecimal price,

        String isbn,

        String category,

        String author,

        String tableOfContents,

        int numberOfPages,

        LocalDateTime publicationDate
) {
    public BookDetailsResponse(Book book){
        this(book.getTitle(),
                book.getSummary(),
                book.getPrice(),
                book.getIsbn(),
                book.getCategory(),
                book.getAuthor(),
                book.getTableOfContents(),
                book.getNumberOfPages(),
                book.getPublicationDate());
    }
}
