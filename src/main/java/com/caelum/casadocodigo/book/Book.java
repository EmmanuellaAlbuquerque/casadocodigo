package com.caelum.casadocodigo.book;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String summary;
    private BigDecimal price;
    private String isbn;
    private String category;
    private String author;

    @Column(name = "table_of_contents")
    private String tableOfContents;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    @Column(name = "publication_date")
    private LocalDateTime publicationDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    public Book() {}

    public Book(String title, String summary, BigDecimal price, String isbn, String category, String author, String tableOfContents, int numberOfPages, LocalDateTime publicationDate) {
        this.title = title;
        this.summary = summary;
        this.price = price;
        this.isbn = isbn;
        this.category = category;
        this.author = author;
        this.tableOfContents = tableOfContents;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
