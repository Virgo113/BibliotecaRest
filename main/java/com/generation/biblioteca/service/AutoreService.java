package com.generation.biblioteca.service;

import java.util.List;

import com.generation.biblioteca.entities.Autore;

public interface AutoreService {
	
	List<Autore> tuttiAutori();
	public Autore unAutoreById(int id);
	public List<Autore> unAutoreByCognome(String cognome);
	
	
	
	

}
