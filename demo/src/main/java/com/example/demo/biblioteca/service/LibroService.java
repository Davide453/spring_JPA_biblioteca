package com.example.demo.biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.biblioteca.LibroRepository;
import com.example.demo.biblioteca.model.Libro;

@Service
public class LibroService {
	@Autowired
	private LibroRepository libroRepo;

	public List<Libro> getAllLibro() {

		return libroRepo.findAll();

	}

	public Libro getLibroById(Integer id) {
		return libroRepo.findById(id).orElse(null);

	}

	public void insertLibro(Libro l) {

		libroRepo.save(l);
	}

	public void updateLibro(Libro l) {
		libroRepo.save(l);
	}

	public void deleteLibro(Integer id) {
		libroRepo.deleteById(id);

	}

//JPA KEYWORDS
	public List<Libro> getLibroByName(String titolo) {
		return libroRepo.findByTitolo(titolo);
	}

	public List<Libro> getLibroByContainsName(String titolo) {
		return libroRepo.findByTitoloContains(titolo);
	}

	// NATIVE QUERY
	public List<Libro> getLibroByContainsNameNativeQ(String titolo) {
		return libroRepo.getByTitoloPresenteNative(titolo);
	}

	// JPQL
	public List<Libro> getLibroByContainsNameJPQL(String titolo) {
		return libroRepo.getByTitoloPresenteJPQL(titolo);
	}
}
