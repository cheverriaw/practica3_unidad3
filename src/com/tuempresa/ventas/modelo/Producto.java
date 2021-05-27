package com.tuempresa.ventas.modelo;

import java.math.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Producto {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	@Hidden
	private String id;
	
	@Column(length = 150)
	@Required
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	Categoria categoria;
	
	@Stereotype("DINERO")
	private BigDecimal precio;
	
	@Column
	@Stereotype("TEXTO_GRANDE")
	private String observaciones;
	
}
