package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the logs_errors database table.
 * 
 */
@Entity
@Table(name="logs_errors")
public class LogsError implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="le_id_error")
	private int leIdError;

    @Temporal( TemporalType.DATE)
	@Column(name="le_date")
	private Date leDate;

	@Column(name="le_errorcode")
	private String leErrorcode;

	@Column(name="le_message")
	private String leMessage;

	@Column(name="le_msisdn")
	private int leMsisdn;

    public LogsError() {
    }

	public int getLeIdError() {
		return this.leIdError;
	}

	public void setLeIdError(int leIdError) {
		this.leIdError = leIdError;
	}

	public Date getLeDate() {
		return this.leDate;
	}

	public void setLeDate(Date leDate) {
		this.leDate = leDate;
	}

	public String getLeErrorcode() {
		return this.leErrorcode;
	}

	public void setLeErrorcode(String leErrorcode) {
		this.leErrorcode = leErrorcode;
	}

	public String getLeMessage() {
		return this.leMessage;
	}

	public void setLeMessage(String leMessage) {
		this.leMessage = leMessage;
	}

	public int getLeMsisdn() {
		return this.leMsisdn;
	}

	public void setLeMsisdn(int leMsisdn) {
		this.leMsisdn = leMsisdn;
	}

}