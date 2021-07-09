package com.generation.biblioteca.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.biblioteca.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
