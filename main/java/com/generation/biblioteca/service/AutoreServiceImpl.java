package com.generation.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.biblioteca.dal.AutoreDAO;
import com.generation.biblioteca.entities.Autore;

@Service
public class AutoreServiceImpl implements AutoreService{

	@Autowired
	private AutoreDAO ad;
	
	
	@Override
	public List<Autore> tuttiAutori() {
		return ad.findAll();
	}

	@Override
	public Autore unAutoreById(int id) {
		return ad.findById(id).get();
	}

	@Override
	public List<Autore> unAutoreByCognome(String cognome) {
		return ad.findByCognome(cognome);
	}

}
