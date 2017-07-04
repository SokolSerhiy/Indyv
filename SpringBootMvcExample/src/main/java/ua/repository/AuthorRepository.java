package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
	@Query("SELECT a FROM Author a LEFT JOIN FETCH a.books WHERE a.name=?1")
	Author findByName(String name);
}