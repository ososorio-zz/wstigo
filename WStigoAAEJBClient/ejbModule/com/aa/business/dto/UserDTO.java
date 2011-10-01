package com.aa.business.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7543546887355547574L;

	private int usId;

	private String usEmail;

	private String usIdentification;

	private Date usLastDateLogin;

	private String usLastnames;

	private String usNames;

	private String usPassword;

	private int usRol;
	
	public UserDTO(){}
	
	
	public UserDTO(int usId,String usLastnames, String usNames, int usRol) {
		super();
		this.usLastnames = usLastnames;
		this.usNames = usNames;
		this.usRol = usRol;
		this.usId=usId;
	}


	public UserDTO(int usId, String usEmail, String usIdentification,
			Date usLastDateLogin, String usLastnames, String usNames,
			String usPassword, int usRol, String usTypeidentification) {
		super();
		this.usId = usId;
		this.usEmail = usEmail;
		this.usIdentification = usIdentification;
		this.usLastDateLogin = usLastDateLogin;
		this.usLastnames = usLastnames;
		this.usNames = usNames;
		this.usPassword = usPassword;
		this.usRol = usRol;
		this.usTypeidentification = usTypeidentification;
	}

	public int getUsId() {
		return usId;
	}

	public void setUsId(int usId) {
		this.usId = usId;
	}

	public String getUsEmail() {
		return usEmail;
	}

	public void setUsEmail(String usEmail) {
		this.usEmail = usEmail;
	}

	public String getUsIdentification() {
		return usIdentification;
	}

	public void setUsIdentification(String usIdentification) {
		this.usIdentification = usIdentification;
	}

	public Date getUsLastDateLogin() {
		return usLastDateLogin;
	}

	public void setUsLastDateLogin(Date usLastDateLogin) {
		this.usLastDateLogin = usLastDateLogin;
	}

	public String getUsLastnames() {
		return usLastnames;
	}

	public void setUsLastnames(String usLastnames) {
		this.usLastnames = usLastnames;
	}

	public String getUsNames() {
		return usNames;
	}

	public void setUsNames(String usNames) {
		this.usNames = usNames;
	}

	public String getUsPassword() {
		return usPassword;
	}

	public void setUsPassword(String usPassword) {
		this.usPassword = usPassword;
	}

	public int getUsRol() {
		return usRol;
	}

	public void setUsRol(int usRol) {
		this.usRol = usRol;
	}

	public String getUsTypeidentification() {
		return usTypeidentification;
	}

	public void setUsTypeidentification(String usTypeidentification) {
		this.usTypeidentification = usTypeidentification;
	}

	private String usTypeidentification;

	
	
}
