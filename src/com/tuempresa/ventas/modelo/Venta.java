package com.tuempresa.ventas.modelo;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;

	@Column
	@Required
	private String numero;
	
	@Column
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	@Stereotype("FECHA")
	private LocalDate fecha;
	
	//Relacion con cliente
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@ReferenceView("Simple")
	private Cliente cliente;
	
	//relacion con el empleado
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@ReferenceView("Simple")
	private Empleado empleado;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	
	//relacion con detalle venta
	@ElementCollection
	@ListProperties("producto.id, producto.descripcion, producto.precio, cantidad, subtotal") // en comillas se colocan los diversos atributos de detalle factura
	private Collection<DetalleVenta> detalles;
}
