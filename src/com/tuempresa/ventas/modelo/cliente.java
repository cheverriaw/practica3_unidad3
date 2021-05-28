package com.tuempresa.ventas.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class cliente {
	@GeneratedValue(generator="System-uuid")
	@GenericGenerator(name ="system-uuid" , strategy="uuid" )
	@Hidden
	@Column(length = 32)
	private String id;
	@Column(length= 30)
	@Stereotype("NOMBRE_PERSONA")
	@Required
	private String nombre;
}
