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

import com.example.demo.biblioteca.model.Tesserati;
import com.example.demo.biblioteca.service.TesseratiService;

@RequestMapping("api/tesserati")
@RestController
public class TesseratiController {

	@Autowired
	private TesseratiService tesseratiService;

	@GetMapping()
	public List<Tesserati> getAllTesserati() {
		return tesseratiService.getAllTesserati();
	}

	@GetMapping("/{id}")
	public Tesserati getTesseratiById(@PathVariable("id") Integer id) {
		return tesseratiService.getTesseratiById(id);
	}

	@PostMapping
	public void insertTesserati(@RequestParam(value = "nome") String nome,
			@RequestParam(value = "cognome") String cognome) {
		Tesserati t = new Tesserati(nome, cognome);

		tesseratiService.insertTesserati(t);
	}

	@PutMapping("/{id}")
	public void updateTesserati(@PathVariable("id") int id, @RequestParam(value = "nome") String nome,
			@RequestParam(value = "cognome") String cognome, @RequestParam(value = "richiami") Integer richiami) {
		Tesserati t = new Tesserati(id, nome, cognome, richiami);

		tesseratiService.updateTesserati(t);
	}

	@DeleteMapping("/{id}")
	public void deleteTesserati(@PathVariable("id") Integer id) {
		tesseratiService.deleteTesserati(id);
	}

	// JPA KEYWORDS
	@GetMapping("/jpa")
	public List<Tesserati> getAllTesseratiByRichiamiJPA(@RequestParam(value = "richiami") Integer richiami) {
		return tesseratiService.getTesseratiByRichiami(richiami);
	}

	// NATIVE QUERY
	@GetMapping("/native")
	public List<Tesserati> getAllTesseratiByRichiamiNative(@RequestParam(value = "richiami") Integer richiami) {
		return tesseratiService.getTesseratiByRichiamiNative(richiami);
	}

	// JPQL
	@GetMapping("/jpql")
	public List<Tesserati> getAllTesseratiByRichiamiJPQL(@RequestParam(value = "richiami") Integer richiami) {
		return tesseratiService.getTesseratyByRichiamiJPQL(richiami);
	}

}
