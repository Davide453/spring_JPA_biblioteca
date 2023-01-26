package com.example.demo.biblioteca.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biblioteca.model.View;
import com.example.demo.biblioteca.service.ViewService;

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

@RequestMapping("api/view")
@RestController()
public class ViewController {
	@Autowired
	ViewService viewService;

	@GetMapping("/{id}")
	public View getTesseratiById(@PathVariable("id") Integer id) {
		return viewService.getTesseratiById(id);
	}

	@GetMapping
	public List<View> getAllTesserati() {
		return viewService.getAllTesserati();
	}

	@GetMapping("/min")
	public List<View> getTesseratiByMinLibri(@RequestParam("quantita") Integer quantita) {
		return viewService.getTesseratiByMinLibri(quantita);
	}

	@GetMapping("/max")
	public List<View> getTesseratiByMaxLibri(@RequestParam("quantita") Integer quantita) {
		return viewService.getTesseratiByMaxLibri(quantita);
	}

	@GetMapping("/nomeintero")
	public List<View> getTesseratyByNomeIntero(@RequestParam("nome") String nome,
			@RequestParam("cognome") String cognome) {
		return viewService.getTesseratiByNomeIntero(nome, cognome);
	}
}
