package com.example.demo.biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.biblioteca.model.Libro;

public class LibroRowMapper  implements RowMapper<Libro> {

	@Override
	public Libro mapRow(ResultSet rs, int rowNum) throws SQLException {
		Libro libro = new Libro();
		
		libro.setId(rs.getInt("idlibro"));
		libro.setTitolo(rs.getString("titolo"));
		libro.setGenere(rs.getString("genere"));
		libro.setPrenotato(rs.getInt("prenotato"));
		return libro;
	}

}
