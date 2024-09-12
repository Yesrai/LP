package pe.edu.upeu.examen.serviceImpl;
import pe.edu.upeu.examen.dao.OrdenDao;
import pe.edu.upeu.examen.entity.Orden;
import pe.edu.upeu.examen.service.OrdenService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements OrdenService {
	@Autowired
	private OrdenDao dao;
	@Override
	public Orden create(Orden a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Orden update(Orden a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
