package com.caelum.casadocodigo.book;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/get-all-books")
    public List<BookDetailsResponse> getAllBook(){

        List<Book> allBooks = bookRepository.findAll();
        List<BookDetailsResponse> bookDetailsResponseList = new ArrayList<>();

//        for(Book book : allBooks){
//            BookDetailsResponse bookDetailsResponse = new BookDetailsResponse(book);
//            bookDetailsResponseList.add(bookDetailsResponse);
//        }

        bookDetailsResponseList = allBooks.stream().map((book) -> new BookDetailsResponse(book)).toList();

        return bookDetailsResponseList;
    }

    @PostMapping("/insert-book")
    public ResponseEntity<Void> insertBook(@Valid @RequestBody BookRequestDTO bookRequestDTO){

        //validar título
        //validar isbn

        bookRepository.save(bookRequestDTO.toModel());

        return ResponseEntity.ok().build();

    }

}
