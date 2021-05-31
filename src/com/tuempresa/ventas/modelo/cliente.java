package com.tuempresa.ventas.modelo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Cliente {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name ="system-uuid" , strategy="uuid" )
	@Hidden
	@Column(length = 32)
	private String id;
	
	@Column(length= 30)
	@Stereotype("NOMBRE_PERSONA")
	@Required
	private String nombre;
	
	//relacion con venta
	@OneToMany(mappedBy = "cliente")
	private List<Venta> ventas;
}
