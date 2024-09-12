package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.examen.dao.OrdenDao;
import pe.edu.upeu.examen.entity.Orden;
import pe.edu.upeu.examen.repository.OrdenRepository;

public class OrdenDaoImpl implements OrdenDao {
	@Autowired
	private OrdenRepository ordenRepository;
	@Override
	public Orden create(Orden a) {
		// TODO Auto-generated method stub
		return  ordenRepository.save(a);
	}

	@Override
	public Orden update(Orden a) {
		// TODO Auto-generated method stub
		return  ordenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method 
		 ordenRepository.deleteById(id);
		
	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return  ordenRepository.findById(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return  ordenRepository.findAll();
	}

}
