package com.generation.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.biblioteca.dal.LibroDAO;
import com.generation.biblioteca.entities.Libro;

	@Service
	public class LibroServiceImpl implements LibroService{
				
		@Autowired //crea automaticamente il libroDAO quando ne avrá bisogno
		private LibroDAO repo;

		@Override
		public List<Libro> findAll() {
			
			return repo.findAll();
		}

		@Override
		public Libro findOneById(int id) {
			
			return repo.findById(id).get();
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Libro UpdLibro(Libro l) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Libro addLibro(Libro l) {
			// TODO Auto-generated method stub
			return null;
		}


}
