package pe.edu.upeu.examen.service;
import java.util.List;
import java.util.Optional;
import pe.edu.upeu.examen.entity.Forma_pago;


public interface Forma_pagoService {
	Forma_pago create(Forma_pago a);
	Forma_pago update(Forma_pago a);
	void delete (Long id);
	Optional<Forma_pago> read(Long id);
	List <Forma_pago> readAll();
}
