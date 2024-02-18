package com.example.training.repositories;

import com.example.training.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = """
    select b.* from books b 
    join book_category bc
    on b.id = bc.book_id
    where bc.category_id = :id
""", nativeQuery = true)
    public List<Book> findBooksByCategory(Long id);
}
