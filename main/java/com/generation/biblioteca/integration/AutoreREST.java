package com.generation.biblioteca.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.biblioteca.entities.Autore;
import com.generation.biblioteca.service.AutoreService;

@RestController
@RequestMapping("/api/autori")
public class AutoreREST {

	@Autowired
	AutoreService as;
	
	@GetMapping("")
	List<Autore> autori(){
	
		return as.tuttiAutori();
	}

	@GetMapping("/{id}")
	Autore autoreId(@PathVariable("id") int id) {
		return as.unAutoreById(id);
	}
	
	
	@GetMapping("/cognome/{cognome}")
	List<Autore> autoreCognome(@PathVariable ("cognome") String cognome) {
		return as.unAutoreByCognome(cognome);
	}
	
}
