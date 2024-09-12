package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Orden;


public interface OrdenService {
	Orden create(Orden a);
	Orden update(Orden a);
	void delete (Long id);
	Optional<Orden> read(Long id);
	List <Orden> readAll();
}
