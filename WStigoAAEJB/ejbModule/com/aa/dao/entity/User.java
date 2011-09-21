package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="us_id")
	private int usId;

	@Column(name="us_email")
	private String usEmail;

	@Column(name="us_identification")
	private String usIdentification;

    @Temporal( TemporalType.DATE)
	@Column(name="us_last_date_login")
	private Date usLastDateLogin;

	@Column(name="us_lastnames")
	private String usLastnames;

	@Column(name="us_names")
	private String usNames;

	@Column(name="us_password")
	private String usPassword;

	@Column(name="us_rol")
	private int usRol;

	@Column(name="us_typeidentification")
	private String usTypeidentification;

    public User() {
    }

	public int getUsId() {
		return this.usId;
	}

	public void setUsId(int usId) {
		this.usId = usId;
	}

	public String getUsEmail() {
		return this.usEmail;
	}

	public void setUsEmail(String usEmail) {
		this.usEmail = usEmail;
	}

	public String getUsIdentification() {
		return this.usIdentification;
	}

	public void setUsIdentification(String usIdentification) {
		this.usIdentification = usIdentification;
	}

	public Date getUsLastDateLogin() {
		return this.usLastDateLogin;
	}

	public void setUsLastDateLogin(Date usLastDateLogin) {
		this.usLastDateLogin = usLastDateLogin;
	}

	public String getUsLastnames() {
		return this.usLastnames;
	}

	public void setUsLastnames(String usLastnames) {
		this.usLastnames = usLastnames;
	}

	public String getUsNames() {
		return this.usNames;
	}

	public void setUsNames(String usNames) {
		this.usNames = usNames;
	}

	public String getUsPassword() {
		return this.usPassword;
	}

	public void setUsPassword(String usPassword) {
		this.usPassword = usPassword;
	}

	public int getUsRol() {
		return this.usRol;
	}

	public void setUsRol(int usRol) {
		this.usRol = usRol;
	}

	public String getUsTypeidentification() {
		return this.usTypeidentification;
	}

	public void setUsTypeidentification(String usTypeidentification) {
		this.usTypeidentification = usTypeidentification;
	}

}