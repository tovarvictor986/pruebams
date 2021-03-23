package com.pruebams.model;

import java.math.BigInteger;
import java.util.Date;

public class TestFacturaModel {
	
	private int idFactura;
	private int idCliente;
	private Date fechaVenta;
	private BigInteger valorTotal;	
	
	public TestFacturaModel() {
		
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public BigInteger getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigInteger valorTotal) {
		this.valorTotal = valorTotal;
	}
}
