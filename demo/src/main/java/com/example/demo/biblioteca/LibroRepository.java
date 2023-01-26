package com.example.demo.biblioteca;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.biblioteca.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

	// JPA KEYWORDS
	List<Libro> findByTitolo(String titolo);

	List<Libro> findByTitoloContains(String titolo);

	// NATIVE QUERY
	@Query(value = "SELECT * FROM biblioteca.libro WHERE titolo LIKE %?1%", nativeQuery = true)
	List<Libro> getByTitoloPresenteNative(String titolo);

	// JPQL
	@Query(value = "SELECT l FROM Libro l WHERE titolo LIKE %?1%")
	List<Libro> getByTitoloPresenteJPQL(String titolo);

}
