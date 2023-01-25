package com.example.demo.biblioteca.model;

public class Libro {
	private int id;
	private String titolo;
	private String genere;
	private int prenotato;

	public Libro() {

	}

	public Libro(String titolo, String genere) {
		this.titolo = titolo;
		this.genere = genere;
		
	}

	public Libro(int id, String titolo, String genere, int prenotato) {
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.prenotato = prenotato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPrenotato() {
		return prenotato;
	}

	public void setPrenotato(int prenotato) {
		this.prenotato = prenotato;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", genere=" + genere + ", prenotato=" + prenotato + "]";
	}

}
