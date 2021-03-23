package com.pruebams.model;

import java.math.BigInteger;

public class TestFacturaDetalleModel {
	
	private int idFacturaDetalle;
	private int idFactura;
	private int idProducto;
	private int cantidad;
	private BigInteger valorUnidad;	
	private BigInteger valorTotal;	
	
	public TestFacturaDetalleModel() {
		
	}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigInteger getValorUnidad() {
		return valorUnidad;
	}

	public void setValorUnidad(BigInteger valorUnidad) {
		this.valorUnidad = valorUnidad;
	}

	public BigInteger getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigInteger valorTotal) {
		this.valorTotal = valorTotal;
	}
}
