package com.tuempresa.ventas.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class DetalleVenta {
	
	@Column
	@Required
	private int cantidad;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal iva;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	
	//Realizamos la relación con producto
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Producto producto;

}
