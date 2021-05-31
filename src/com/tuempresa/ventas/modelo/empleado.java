package com.tuempresa.ventas.modelo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name ="system-uuid" , strategy="uuid" )
	@Hidden
	@Column(length = 32)
	private String id;
	
	@Column(length = 32)
	@Stereotype("NOMBRE_PERSONA")
	@Required
	private String nombre;
	
	@Column(length = 10)
	@Required
	private String DUI;
	
	@Column(length = 32)
	@Required
	@Stereotype("TEXTO_LARGO")
	private String direccion;
	
	@Column(length = 32)
	@Required
	@Stereotype("TELEFONO")
	private String telefono;
	
	@Column(length = 32)
	@Required
	private String seguro;
	
	//relacion con venta
	@OneToMany(mappedBy = "empleado")
	private List<Venta> ventas;
	
	

}
