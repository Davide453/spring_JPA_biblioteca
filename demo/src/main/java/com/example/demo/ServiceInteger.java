package com.example.demo;

import java.util.ArrayList;

public class ServiceInteger {

	private final ArrayList<Integer> list = new ArrayList<Integer>();

	public ArrayList<Integer> getAllInteger() {
		return this.list;
	}

	public int getIntegerById(int id) {
		return this.list.get(id);
	}

	public void insertInteger(int numero) {
		list.add(numero);
	}

	public void updateInteger(int id, int numero) {
		list.set(id, numero);
	}

	public void deleteInteger(int id) {
		list.remove(id);
	}

}
