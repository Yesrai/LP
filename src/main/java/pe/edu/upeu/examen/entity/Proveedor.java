package pe.edu.upeu.examen.entity;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="proveedores")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ruc", length = 24)
	private Long ruc;
	@Column(name = "razonsocial", length = 50)
	private String razonsocial;
	@Column(name = "contacto", length = 50)
	private String contacto;
	@Column(name = "telefono", length = 9)
	private String telefono;
	@Column(name = "estado", length = 1)
	private String estado;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proveedores")
	@JsonIgnore
	private Set<Orden>ordenes;
}
