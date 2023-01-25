package com.example.demo.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.biblioteca.LibroRowMapper;
import com.example.demo.biblioteca.model.Libro;

@Service
public class LibroService {
	@Autowired
	private JdbcTemplate jdbcTemplate; // nuovo bean spring
	private LibroRowMapper libroRow = new LibroRowMapper();

	public List<Libro> getAllLibro() {

		List<Libro> list = jdbcTemplate.query("select * from biblioteca.libro", libroRow);
		return list;
	}

	public List<Libro> getLibroById(int id) {
		List<Libro> list = jdbcTemplate.query("select * from biblioteca.libro where idlibro=?", libroRow, id);

		return list;
	}

	public void insertLibro(Libro l) {
		jdbcTemplate.update("insert into biblioteca.libro (titolo,genere) values (?, ?);", l.getTitolo(),
				l.getGenere());
	}

	public void updateLibro(Libro l) {
		jdbcTemplate.update("UPDATE  biblioteca.libro set titolo=?, genere=?,prenotato=? where idlibro=?",
				l.getTitolo(), l.getGenere(), l.getPrenotato(), l.getId());
	}

	public void deleteLibro(int id) {
		jdbcTemplate.update("DELETE from biblioteca.libro where idlibro=?", id);
	}

}
