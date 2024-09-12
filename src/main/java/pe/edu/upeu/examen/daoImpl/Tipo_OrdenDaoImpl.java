package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.examen.dao.Tipo_OrdenDao;
import pe.edu.upeu.examen.entity.Tipo_Orden;
import pe.edu.upeu.examen.repository.Tipo_OrdenRepository;

public class Tipo_OrdenDaoImpl implements Tipo_OrdenDao {
	@Autowired
	private Tipo_OrdenRepository tipo_ordenRepository;
	@Override
	public Tipo_Orden create(Tipo_Orden a) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(a);
	}

	@Override
	public Tipo_Orden update(Tipo_Orden a) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method 
		tipo_ordenRepository.deleteById(id);
		
	}

	@Override
	public Optional<Tipo_Orden> read(Long id) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findById(id);
	}

	@Override
	public List<Tipo_Orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findAll();
	}

}
