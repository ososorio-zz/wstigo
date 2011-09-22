package com.aa.business.dto;

import java.io.Serializable;

public class InformationDTO implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 3322551177459104822L;
	
	private String estado;
	
	private String nombreId;
	
	private String tipoId;
	
	private String numeroId;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombreId() {
		return nombreId;
	}

	public void setNombreId(String nombreId) {
		this.nombreId = nombreId;
	}

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public String getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}
}
