package com.aa.business.dto;

import java.io.Serializable;

public class InformationDTO implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 3322551177459104822L;
	
	private String telefono;
	private String typodoc;
	private String numerodoc;
	private String plan;
	private String paqueteactual;
	private String estadopaquete;
	private String nombreusuario;
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTypodoc() {
		return typodoc;
	}
	public void setTypodoc(String typodoc) {
		this.typodoc = typodoc;
	}
	public String getNumerodoc() {
		return numerodoc;
	}
	public void setNumerodoc(String numerodoc) {
		this.numerodoc = numerodoc;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getPaqueteactual() {
		return paqueteactual;
	}
	public void setPaqueteactual(String paqueteactual) {
		this.paqueteactual = paqueteactual;
	}
	public String getEstadopaquete() {
		return estadopaquete;
	}
	public void setEstadopaquete(String estadopaquete) {
		this.estadopaquete = estadopaquete;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}

}
