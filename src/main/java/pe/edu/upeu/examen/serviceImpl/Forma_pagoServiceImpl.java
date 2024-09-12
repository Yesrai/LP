package pe.edu.upeu.examen.serviceImpl;
import pe.edu.upeu.examen.dao.Forma_pagoDao;
import pe.edu.upeu.examen.entity.Forma_pago;
import pe.edu.upeu.examen.service.Forma_pagoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Forma_pagoServiceImpl implements Forma_pagoService {
	@Autowired
	private  Forma_pagoDao forma_pagoDao;
	@Override
	public  Forma_pago create(Forma_pago a) {
		// TODO Auto-generated method stub
		return forma_pagoDao.create(a);
	}

	@Override
	public  Forma_pago update(Forma_pago a) {
		// TODO Auto-generated method stub
		return forma_pagoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		forma_pagoDao.delete(id);
		
	}

	@Override
	public Optional<Forma_pago> read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoDao.read(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoDao.readAll();
	}

}
