package com.tuempresa.ventas.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	
	@Column(length = 150)
	@Required
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	Categoria categoria;
	
	@Column
	@Stereotype("DINERO")
	private BigDecimal precio;
	
	
}
