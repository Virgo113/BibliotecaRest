package com.generation.biblioteca.service;

import java.util.List;

import com.generation.biblioteca.entities.Libro;

public interface LibroService {

	List<Libro> findAll();
	public Libro findOneById(int id);
	
	void delete(int id);
	Libro UpdLibro(Libro l);
	Libro addLibro(Libro l);
}
