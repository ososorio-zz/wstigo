package com.aa.business.dto;

public class CancelateDTO {

	private int id;
	private String reason;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public CancelateDTO(int id, String reason) {
		super();
		this.id = id;
		this.reason = reason;
	}
	
}
