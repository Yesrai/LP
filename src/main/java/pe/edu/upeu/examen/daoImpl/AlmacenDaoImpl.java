package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.examen.dao.AlmacenDao;
import pe.edu.upeu.examen.entity.Almacen;
import pe.edu.upeu.examen.repository.AlmacenRepository;

public class AlmacenDaoImpl implements AlmacenDao {
	@Autowired
	private AlmacenRepository almacenRepository;
	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return almacenRepository.save(a);
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return almacenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method 
		almacenRepository.deleteById(id);
		
	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return almacenRepository.findById(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return almacenRepository.findAll();
	}

}
