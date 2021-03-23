package com.pruebams.model;

import java.io.Serializable;

public class ModelData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3084640162312612815L;
	private int code;
	private String mensaje;
	private boolean estado;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
