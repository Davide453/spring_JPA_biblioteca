package com.example.demo.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.biblioteca.TesseratiRowMapper;
import com.example.demo.biblioteca.model.Tesserati;

@Service
public class TesseratiService {
	@Autowired
	private JdbcTemplate jdbcTemplate; // nuovo bean spring
	private TesseratiRowMapper tesseratiRow = new TesseratiRowMapper();

	public List<Tesserati> getAllTesserati() {
		List<Tesserati> list = jdbcTemplate.query("select * from biblioteca.tesserati", tesseratiRow);
		return list;
	}

	public List<Tesserati> getTesseratiById(int id) {

		List<Tesserati> list = jdbcTemplate.query("select * from biblioteca.tesserati where idtesserati=?",
				tesseratiRow, id);

		return list;
	}

	public void insertTesserati(Tesserati t) {
		jdbcTemplate.update("insert into biblioteca.tesserati (nome,cognome) values (?, ?);", t.getNome(),
				t.getCognome());
	}

	public void updateTesserati(Tesserati t) {
		jdbcTemplate.update("UPDATE  biblioteca.tesserati set nome=?, cognome=? where idtesserati=?", t.getNome(),
				t.getCognome(), t.getId());
	}

	public void deleteTesserati(int id) {
		jdbcTemplate.update("DELETE from biblioteca.tesserati where idtesserati=?", id);
	}

}
