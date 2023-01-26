package com.example.demo.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "libro", schema = "biblioteca")
@Entity
public class Libro {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idlibro;
	private String titolo;
	private String genere;
	@Column(nullable = true)
	private Integer prenotato;

	public Libro() {

	}

	public Libro(String titolo, String genere) {
		this.titolo = titolo;
		this.genere = genere;

	}

	public Libro(Integer idlibro, String titolo, String genere, Integer prenotato) {
		this.idlibro = idlibro;
		this.titolo = titolo;
		this.genere = genere;
		this.prenotato = prenotato;

	}

	public Integer getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(Integer idlibro) {
		this.idlibro = idlibro;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Integer getPrenotato() {
		return prenotato;
	}

	public void setPrenotato(Integer prenotato) {
		this.prenotato = prenotato;
	}

	@Override
	public String toString() {
		return "Libro [idlibro=" + idlibro + ", titolo=" + titolo + ", genere=" + genere + ", prenotato=" + prenotato
				+ "]";
	}

}
