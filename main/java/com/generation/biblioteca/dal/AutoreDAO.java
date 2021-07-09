package com.generation.biblioteca.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.biblioteca.entities.Autore;

public interface AutoreDAO extends JpaRepository<Autore, Integer>{

	List<Autore> findByCognome(String cognome);
	
	
}
