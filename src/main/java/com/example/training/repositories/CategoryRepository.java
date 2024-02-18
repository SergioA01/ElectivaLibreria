package com.example.training.repositories;

import com.example.training.entities.Book;
import com.example.training.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    //@Query("SELECT a FROM Author a WHERE a.name LIKE CONCAT('%',:name,'%')")
    //public List<Author> findByName(String name);

}
