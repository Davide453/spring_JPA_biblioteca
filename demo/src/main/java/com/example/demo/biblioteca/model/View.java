package com.example.demo.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "libri_prenotati", schema = "biblioteca")
@Entity()
public class View {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idtesserati;
	private String nome;
	private String cognome;
	private Integer richiami;
	private Integer quantita_libri_prenotati;

	public View() {
	}

	public View(Integer idtesserati, String nome, String cognome, Integer richiami, Integer quantita_libri_prenotati) {
		super();
		this.idtesserati = idtesserati;
		this.nome = nome;
		this.cognome = cognome;
		this.richiami = richiami;
		this.quantita_libri_prenotati = quantita_libri_prenotati;
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

	public Integer getQuantita_libri_prenotati() {
		return quantita_libri_prenotati;
	}

	public void setQuantita_libri_prenotati(Integer quantita_libri_prenotati) {
		this.quantita_libri_prenotati = quantita_libri_prenotati;
	}

}
