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
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	
	/*
	@Stereotype("DINERO")
	@Depends("producto.id, cantidad")
	public BigDecimal setSubtotal() { 
	    if (producto == null || producto.getPrecio() == null) return BigDecimal.ZERO;
	    return new BigDecimal(cantidad).multiply(producto.getPrecio());
	}
	*/
	
	
	@Stereotype("DINERO")
	@Depends("producto.id, cantidad") 
	public BigDecimal getSubtotal() { 
	    if (producto == null || producto.getPrecio() == null) return BigDecimal.ZERO;
	    return new BigDecimal(cantidad).multiply(producto.getPrecio());
	}
	
	//Realizamos la relación con producto
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Producto producto;

	
	
	
	
}
