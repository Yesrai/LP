package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Proveedor;


public interface ProveedorService {
	Proveedor create(Proveedor a);
	Proveedor update(Proveedor a);
	void delete (Long id);
	Optional<Proveedor> read(Long id);
	List <Proveedor> readAll();
}
