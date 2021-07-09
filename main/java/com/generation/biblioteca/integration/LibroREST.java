package com.generation.biblioteca.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.biblioteca.entities.Libro;
import com.generation.biblioteca.service.LibroService;

@RestController
@RequestMapping("/api/libri")
public class LibroREST {
	
	@Autowired
	private LibroService servizio;
	
	@GetMapping("")
	List<Libro> getAll(){
		
		return servizio.findAll();	
	}
	@GetMapping("/{id}")
	Libro getOne(@PathVariable("id") int id){
		
		return servizio.findOneById(id);	
	}
	
	
	
	
	
	

}
