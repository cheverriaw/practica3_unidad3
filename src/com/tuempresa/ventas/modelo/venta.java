package com.tuempresa.ventas.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity  @Getter @Setter
public class venta {

	@Id
	@GeneratedValue(generator="System-uuid")
	@GenericGenerator(name ="system-uuid" , strategy="uuid" )
	@Hidden
	@Column(length = 32)
	private String id;
	@Column(length = 32)
	@Required
	private String producto;
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal monto;
	@Column
	@Required
	private String pago;
	@Column
	private String vendedor;
	@Column 
	@Stereotype("TEXTO_GRANDE")
	private String descripcion;
	@Column
	@Required
	@Stereotype("FECHA")
	private LocalDate fecha; 
	
	
}
