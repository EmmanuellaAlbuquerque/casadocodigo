package com.caelum.casadocodigo.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    boolean existsByIsbn(String isbn);

    boolean existsByTitle(String title);
}
