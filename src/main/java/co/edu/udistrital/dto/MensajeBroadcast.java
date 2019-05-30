package co.edu.udistrital.dto;

import java.io.Serializable;

public class MensajeBroadcast implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6932301290367197734L;
	private String contenido;
	
	public MensajeBroadcast(){
	}

	public MensajeBroadcast(String contenido) {
		super();
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
}
