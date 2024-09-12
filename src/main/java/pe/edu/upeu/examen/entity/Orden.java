package pe.edu.upeu.examen.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipo_orden id")
	private Long tipo_ordenid;
	@Column(name = "forma_pago id")
	private Long forma_pagoid;
	@Column(name = "almacen id")
	private Long almacen_id;
	@Column(name = "correo", length = 50)
	private String correo;
	@Column(name = "fecha de orden")
	@Temporal(TemporalType.DATE)
	private Date fecha_orden;
	@Column(name = "fecha solicita")
	@Temporal(TemporalType.DATE)
	private Date fecha_solicita;
	@Column(name = "estado", length = 1)
	private String estado;

	@ManyToOne
	@JoinColumn(name = "almacen_id", nullable = false)
	private Almacen almacenes;
	
	@ManyToOne
	@JoinColumn(name = "forma_pagoid", nullable = false)
	private Forma_pago formas_pago;
	
	@ManyToOne
	@JoinColumn(name = "tipo_ordeid", nullable = false)
	private Tipo_Orden tipos_orden;
	@ManyToOne
	@JoinColumn(name = "proveedor_id", nullable = false)
	private Proveedor proveedores;
	
}
