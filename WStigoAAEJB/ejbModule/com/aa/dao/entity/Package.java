package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the package database table.
 * 
 */
@Entity
@Table(name="package")
@NamedQueries({
@NamedQuery(name=Package.queryInfoPackage,
			query="SELECT c FROM Package c WHERE c.pcId <> :idpackage"),
@NamedQuery(name=Package.queryInfoPackageName,
					query="SELECT c FROM Package c WHERE c.pcId = :idpackage"),
@NamedQuery(name=Package.queryInfoAvailable,
					query="SELECT c FROM Package c WHERE c.pcId <> :idPackage"),
@NamedQuery(name=Package.queryInfoPackage1,
					query="SELECT c FROM Package c")
					
})

public class Package implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String queryInfoPackage1 ="queryInfoPackage1";
	public static final String queryInfoPackage = "queryinfopackage";
	public static final String queryInfoPackageName = "queryinfopackagename";
	public static final String queryInfoAvailable = "queryInfoAvailable";
	
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