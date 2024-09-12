package pe.edu.upeu.examen.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Proveedor;


public interface ProveedorDao {
	Proveedor create(Proveedor a);
	Proveedor update(Proveedor a);
	void delete(Long id);
	Optional<Proveedor> read(Long id);
	List<Proveedor> readAll();
}
