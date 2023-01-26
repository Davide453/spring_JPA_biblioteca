package com.example.demo.biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.biblioteca.model.Tesserati;

public class TesseratiRowMapper implements RowMapper<Tesserati> {

	@Override
	public Tesserati mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tesserati tesserato = new Tesserati();
		tesserato.setIdtesserati(rs.getInt("idtesserati"));
		tesserato.setNome(rs.getString("nome"));
		tesserato.setCognome(rs.getString("Cognome"));
		return tesserato;
	}

}
