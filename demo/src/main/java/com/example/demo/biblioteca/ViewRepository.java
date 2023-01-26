package com.example.demo.biblioteca;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.biblioteca.model.View;

public interface ViewRepository extends JpaRepository<View, Integer> {

	@Query(value = "SELECT v FROM View v")
	List<View> getAllTesserati();

	@Query(value = "SELECT v FROM View v where v.idtesserati= ?1")
	View getById(Integer id);

	@Query(value = "SELECT v FROM View v where v.quantita_libri_prenotati>= ?1")
	List<View> getByQuantitaDiLibriMIN(Integer id);

	@Query(value = "SELECT v FROM View v where v.quantita_libri_prenotati<= ?1")
	List<View> getByQuantitaDiLibriMAX(Integer id);

	@Query(value = "SELECT v FROM View v where(v.nome like ?1% and v.cognome like %?2)")
	List<View> getByNomeIntero(String nome, String cognome);
}
