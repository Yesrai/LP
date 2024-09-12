package pe.edu.upeu.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.examen.entity.Tipo_Orden;
@Repository
public interface Tipo_OrdenRepository extends JpaRepository<Tipo_Orden,Long> {

}
