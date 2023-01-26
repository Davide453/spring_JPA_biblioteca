package com.example.demo.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.biblioteca.ViewRepository;
import com.example.demo.biblioteca.model.View;

@Service
public class ViewService {
	@Autowired
	ViewRepository viewRepository;

	public List<View> getAllTesserati() {
		return viewRepository.getAllTesserati();
	}

	public View getTesseratiById(Integer id) {
		return viewRepository.getById(id);
	}

	public List<View> getTesseratiByMinLibri(Integer quantita) {
		return viewRepository.getByQuantitaDiLibriMIN(quantita);
	}

	public List<View> getTesseratiByMaxLibri(Integer quantita) {
		return viewRepository.getByQuantitaDiLibriMAX(quantita);
	}

	public List<View> getTesseratiByNomeIntero(String nome, String cognome) {
		return viewRepository.getByNomeIntero(nome, cognome);
	}
}
