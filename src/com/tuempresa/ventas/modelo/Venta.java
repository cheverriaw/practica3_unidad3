package com.tuempresa.ventas.modelo;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Venta {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	@Hidden
	private String id;

	@Column
	@Required
	private String numero;
	
	@Column
	@Required
	@Stereotype("FECHA")
	private LocalDate fecha;
	
	//Relacion con cliente
	@ManyToOne
	@DescriptionsList(descriptionProperties = "nombre,id")
	private Cliente cliente;
	
	//relacion con el empleado
	@ManyToOne
	@DescriptionsList(descriptionProperties = "nombre,DUI,id")
	private Empleado empleado;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	
	@Column
	@Required(message = "¡Valor de iva requerido!")
	@Stereotype("DINERO")
	private BigDecimal iva;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	
	//relacion con detalle venta
	@ElementCollection
	@ListProperties("producto.id, producto.descripcion, producto.categoria, producto.precio, cantidad, subtotal, iva, total ") // en comillas se colocan los diversos atributos de detalle factura
	private List<DetalleVenta> detalles;
}
