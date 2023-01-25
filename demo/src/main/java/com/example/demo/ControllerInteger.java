package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInteger {

	ServiceInteger serviceInteger = new ServiceInteger();

	@GetMapping("/integer")
	public ArrayList<Integer> getAllInteger() {

		return serviceInteger.getAllInteger();
	}

	@GetMapping("/integer/{id}")
	public int getIntegerById(@PathVariable("id") int id) {
		return serviceInteger.getIntegerById(id);
	}

	@PostMapping("/integer")
	public void insertInteger(@RequestParam(value = "numero") int numero) {
		 serviceInteger.insertInteger(numero);
	}

	@PutMapping("/integer/{id}")
	public void updateInteger(@PathVariable("id") int id, @RequestParam(value = "numero") int numero) {
		serviceInteger.updateInteger(id, numero);
	}

	@DeleteMapping("/integer/{id}")
	public void deleteIntegerById(@PathVariable("id") int id) {
		serviceInteger.deleteInteger(id);
	}

}
