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
	public List<Tesserati> getTesseratiById(@PathVariable("id") int id) {
		return tesseratiService.getTesseratiById(id);
	}

	@PostMapping()
	public void insertTesserati(@RequestParam(value = "nome") String nome,
			@RequestParam(value = "cognome") String cognome) {
		Tesserati t = new Tesserati(nome, cognome);

		tesseratiService.insertTesserati(t);
	}

	@PutMapping("/{id}")
	public void updateTesserati(@PathVariable("id") int id, @RequestParam(value = "nome") String nome,
			@RequestParam(value = "cognome") String cognome) {
		Tesserati t = new Tesserati(id, nome, cognome);

		tesseratiService.updateTesserati(t);
	}

	@DeleteMapping("/{id}")
	public void deleteTesserati(@PathVariable("id") int id) {
		tesseratiService.deleteTesserati(id);
	}
}
