package com.example.demo.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.biblioteca.TesseratiRepository;
import com.example.demo.biblioteca.model.Tesserati;

@Service
public class TesseratiService {
	@Autowired
	TesseratiRepository tesseratiRepo;

	public List<Tesserati> getAllTesserati() {
		return tesseratiRepo.findAll();
	}

	public Tesserati getTesseratiById(Integer id) {

		return tesseratiRepo.findById(id).orElse(null);
	}

	public void insertTesserati(Tesserati t) {
		t.setRichiami(0);
		tesseratiRepo.save(t);
	}

	public void updateTesserati(Tesserati t) {
		tesseratiRepo.save(t);
	}

	public void deleteTesserati(Integer id) {
		tesseratiRepo.deleteById(id);
	}

// JPA KEYWORDS
	public List<Tesserati> getTesseratiByRichiami(Integer richiami) {
		return tesseratiRepo.findAllByRichiamiGreaterThanEqual(richiami);
	}

	// NATIVE QUERY
	public List<Tesserati> getTesseratiByRichiamiNative(Integer richiami) {
		return tesseratiRepo.getByRichiamiNative(richiami);
	}

	// NATIVE QUERY
	public List<Tesserati> getTesseratyByRichiamiJPQL(Integer richiami) {
		return tesseratiRepo.getByRichiamiJPQL(richiami);
	}
	
}
