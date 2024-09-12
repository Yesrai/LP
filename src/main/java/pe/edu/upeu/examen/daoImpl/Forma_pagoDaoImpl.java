package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.examen.dao.Forma_pagoDao;
import pe.edu.upeu.examen.entity.Forma_pago;
import pe.edu.upeu.examen.repository.Forma_pagoRepository;

public class Forma_pagoDaoImpl implements Forma_pagoDao {
	@Autowired
	private Forma_pagoRepository forma_pagoRepository;
	@Override
	public Forma_pago create(Forma_pago a) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.save(a);
	}

	@Override
	public Forma_pago update(Forma_pago a) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method 
		forma_pagoRepository.deleteById(id);
		
	}

	@Override
	public Optional<Forma_pago> read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.findById(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoRepository.findAll();
	}

}
