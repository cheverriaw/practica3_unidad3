package com.tuempresa.ventas.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="Simple", 
members="id, nombre" 
)
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	
	@Column(length= 30)
	@Stereotype("NOMBRE_PERSONA")
	@Required
	private String nombre;
	
	//relacion con venta
	@OneToMany(mappedBy = "cliente")
	private Collection<Venta> ventas;
}
