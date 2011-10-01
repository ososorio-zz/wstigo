package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the logs_log-in database table.
 * 
 */
@Entity
@Table(name="logs_login")
public class LogsLog_in implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ll_id")
	private int llId;

    @Temporal( TemporalType.DATE)
	@Column(name="ll_date")
	private Date llDate;

	@Column(name="ll_operation")
	private String llOperation;

	@Column(name="ll_us_id")
	private int llUsId;

    public LogsLog_in() {
    }

	public int getLlId() {
		return this.llId;
	}

	public void setLlId(int llId) {
		this.llId = llId;
	}

	public Date getLlDate() {
		return this.llDate;
	}

	public void setLlDate(Date llDate) {
		this.llDate = llDate;
	}

	public String getLlOperation() {
		return this.llOperation;
	}

	public void setLlOperation(String llOperation) {
		this.llOperation = llOperation;
	}

	public int getLlUsId() {
		return this.llUsId;
	}

	public void setLlUsId(int llUsId) {
		this.llUsId = llUsId;
	}

}