package com.tuempresa.ventas.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado {
	
	@Id
	@GeneratedValue(generator="System-uuid")
	@GenericGenerator(name ="system-uuid" , strategy="uuid" )
	@Hidden
	@Column(length = 32)
	private String id;
	
	@Column(length = 32)
	@Stereotype("NOMBRE_PERSONA")
	@Required
	private String Nombre;
	
	@Column(length = 10)
	@Required
	private String DUI;
	
	@Column(length = 32)
	@Required
	@Stereotype("TEXTO_LARGO")
	private String Direccion;
	
	@Column(length = 32)
	@Required
	@Stereotype("TELEFONO")
	private String Telefono;
	
	@Column(length = 32)
	@Required
	private String Seguro ;
	
	

}
