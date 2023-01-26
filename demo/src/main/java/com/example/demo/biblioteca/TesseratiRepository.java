package com.example.demo.biblioteca;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.biblioteca.model.Tesserati;

public interface TesseratiRepository extends JpaRepository<Tesserati, Integer> {
	// JPA KEYWORDS
	List<Tesserati> findAllByRichiamiGreaterThanEqual(Integer richiami);

	// NATIVE QUERY
	@Query(value = "SELECT * FROM biblioteca.tesserati where richiami >= ?1", nativeQuery = true)
	List<Tesserati> getByRichiamiNative(Integer richiami);

	// JPQL
	@Query(value = "SELECT t FROM Tesserati t where richiami >= ?1")
	List<Tesserati> getByRichiamiJPQL(Integer richiami);

	/*
	 * @Query(value =
	 * "create view conta_libri_prenota as select t.idtesserati,t.nome,t.cognome,t.richiami,count(libro.prenotato) as quantita from Tesserati t"
	 * + "join libro on tesserati.idtesserati=libro.prenotato group by idtesserati")
	 * void getQuantitaLibriPrenotati();
	 */
	
	

}
