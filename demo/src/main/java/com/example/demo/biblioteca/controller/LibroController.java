package com.example.demo.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biblioteca.model.Libro;
import com.example.demo.biblioteca.service.LibroService;

@RequestMapping("/api/libro")
@RestController
public class LibroController {

	@Autowired
	private LibroService libroService;

	@GetMapping()
	public List<Libro> getAllLibro() {
		return libroService.getAllLibro();
	}

	@GetMapping("/{id}")
	public List<Libro> getLibroById(@PathVariable("id") int id) {
		return libroService.getLibroById(id);
	}

	@PostMapping()
	public void insertLibro(@RequestParam(value = "titolo") String titolo,
			@RequestParam(value = "genere") String genere) {
		Libro l = new Libro(titolo, genere);
		libroService.insertLibro(l);
	}

	@PutMapping("/{id}")
	public void updateTesserati(@PathVariable("id") int id, @RequestParam(value = "titolo") String titolo,
			@RequestParam(value = "genere") String genere, @RequestParam(value = "prenotato") int prenotato) {
		Libro l = new Libro(id, titolo, genere, prenotato);
		libroService.updateLibro(l);
	}

	@DeleteMapping("/{id}")
	public void deleteTesserati(@PathVariable("id") int id) {
		libroService.deleteLibro(id);
	}
}
