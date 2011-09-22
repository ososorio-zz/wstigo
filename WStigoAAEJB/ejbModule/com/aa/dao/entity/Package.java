package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the package database table.
 * 
 */
@Entity
@Table(name="package")
@NamedQuery(name="BuscarAvailableShopping",
			query="SELECT c FROM package c WHERE c.pc_id <> :idpackage")
public class Package implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pc_id")
	private int pcId;

	private String description;

    public Package() {
    }

	public int getPcId() {
		return this.pcId;
	}

	public void setPcId(int pcId) {
		this.pcId = pcId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}