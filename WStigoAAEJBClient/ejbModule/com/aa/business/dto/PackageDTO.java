package com.aa.business.dto;

import java.io.Serializable;

public class PackageDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3973818193253202502L;

	private String pc_id;
	private String description;
	public String getPc_id() {
		return pc_id;
	}
	public void setPc_id(String pc_id) {
		this.pc_id = pc_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public PackageDTO(String pc_id, String description) {
		super();
		this.pc_id = pc_id;
		this.description = description;
	}

}
