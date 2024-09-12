package pe.edu.upeu.examen.serviceImpl;

import pe.edu.upeu.examen.dao.Tipo_OrdenDao;
import pe.edu.upeu.examen.entity.Tipo_Orden;
import pe.edu.upeu.examen.service.Tipo_OrdenService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tipo_OrdenServiceImpl implements Tipo_OrdenService {
	@Autowired
	private Tipo_OrdenDao dao;
	@Override
	public Tipo_Orden create(Tipo_Orden a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Tipo_Orden update(Tipo_Orden a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Tipo_Orden> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipo_Orden> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
