package pe.edu.upeu.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.examen.entity.Orden;

public interface OrdenRepository extends JpaRepository<Orden,Long> {

}
