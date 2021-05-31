package com.tuempresa.ventas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	
	@Column(length = 150)
	@Required
	private String descripcion;	
}
