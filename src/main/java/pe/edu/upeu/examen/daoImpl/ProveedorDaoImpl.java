package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.examen.dao.ProveedorDao;
import pe.edu.upeu.examen.entity.Proveedor;
import pe.edu.upeu.examen.repository.ProveedorRepository;

public class ProveedorDaoImpl implements ProveedorDao {
	@Autowired
	private ProveedorRepository proveedorRepository;
	@Override
	public Proveedor create(Proveedor a) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(a);
	}

	@Override
	public Proveedor update(Proveedor a) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method 
		proveedorRepository.deleteById(id);
		
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorRepository.findById(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorRepository.findAll();
	}

}
