package com.generation.biblioteca.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.biblioteca.entities.Libro;
import com.generation.biblioteca.service.LibroService;

@Controller
@RequestMapping("/mvc/libri")
public class LibroMVC {
	
	@Autowired
	private LibroService ls;
	
	@RequestMapping("")
	public String elenco(Model m) {
		List<Libro> libri = ls.findAll();
		
		m.addAttribute("libri", libri);
		
		return "elenco";
	}

	@RequestMapping("/{id}")
	public String getOne(@PathVariable("id") int id, Model m) {
		Libro l = ls.findOneById(id);
		
		m.addAttribute("libro", l);
		
		return "dettaglio";
	}
	
}
