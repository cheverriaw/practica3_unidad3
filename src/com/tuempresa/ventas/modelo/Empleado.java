package com.tuempresa.ventas.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="Simple", 
members="id, nombre" 
)
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	
	@Column(length = 32)
	@Stereotype("NOMBRE_PERSONA")
	@Required
	private String nombre;
	
	@Column(length = 10)
	@Required
	private String DUI;
	
	@Column
	@Required
	@Stereotype("TEXTO_LARGO")
	private String direccion;
	
	@Column
	@Required
	@Stereotype("TELEFONO")
	private String telefono;
	
	@Column(length = 32)
	@Required
	private String seguro;
	
	//relacion con venta
	@OneToMany(mappedBy = "empleado")
	private Collection<Venta> ventas;
	
	

}
