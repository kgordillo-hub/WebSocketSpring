package co.edu.udistrital.dto;

import java.io.Serializable;

public class MensajeBroadcast implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6932301290367197734L;
	private String idPaciente;
	private String idDispositivo;
	private String contenido;
	
	public MensajeBroadcast(){
	}

	public MensajeBroadcast(String idPaciente, String idDispositivo, String contenido) {
		super();
		this.idPaciente = idPaciente;
		this.idDispositivo = idDispositivo;
		this.contenido = contenido;
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

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(String idDispositivo) {
		this.idDispositivo = idDispositivo;
	}
	
	
}
