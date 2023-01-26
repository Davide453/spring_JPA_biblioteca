package com.example.demo.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tesserati", schema = "biblioteca")
@Entity
public class Tesserati {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idtesserati;
	private String nome;
	private String cognome;
	private Integer richiami;

	public Tesserati() {
	}

	public Tesserati(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public Tesserati(Integer idtesserati, String nome, String cognome, Integer richiami) {
		super();
		this.idtesserati = idtesserati;
		this.nome = nome;
		this.cognome = cognome;
		this.richiami = richiami;
	}

	public Integer getIdtesserati() {
		return idtesserati;
	}

	public void setIdtesserati(Integer idtesserati) {
		this.idtesserati = idtesserati;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getRichiami() {
		return richiami;
	}

	public void setRichiami(Integer richiami) {
		this.richiami = richiami;
	}

}
