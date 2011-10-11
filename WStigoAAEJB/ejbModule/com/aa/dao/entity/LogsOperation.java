package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the logs_operations database table.
 * 
 */
@Entity
@Table(name="logs_operations")
@NamedQueries({
	@NamedQuery(name=LogsOperation.queryPurchasedService,
			query="SELECT logOp FROM LogsOperation logOp " +
				  "WHERE logOp.loMsisdn = :msisdn"),
	@NamedQuery(name=LogsOperation.queryProveedores,
			query="SELECT logOp FROM LogsOperation logOp " +
				  "WHERE logOp.loDate BETWEEN :initDate AND :lastDate")
})

public class LogsOperation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String queryPurchasedService = "queryPurchasedService";
	
	public static final String queryProveedores = "queryProveedores";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lo_id")
	private int loId;

    @Temporal( TemporalType.DATE)
	@Column(name="lo_date")
	private Date loDate;

	@Column(name="lo_msisdn")
	private Long loMsisdn;

	@Column(name="lo_next_packet")
	private int loNextPacket;

	@Column(name="lo_operation")
	private String loOperation;

	@Column(name="lo_operation_detail")
	private String loOperationDetail;

	@Column(name="lo_previous_packet")
	private int loPreviousPacket;

	@Column(name="lo_usr")
	private int lousr; 
	
    public LogsOperation() {
    }

	public int getLoId() {
		return this.loId;
	}

	public void setLoId(int loId) {
		this.loId = loId;
	}

	public Date getLoDate() {
		return this.loDate;
	}

	public void setLoDate(Date loDate) {
		this.loDate = loDate;
	}

	public Long getLoMsisdn() {
		return this.loMsisdn;
	}

	public void setLoMsisdn(Long loMsisdn) {
		this.loMsisdn = loMsisdn;
	}

	public int getLoNextPacket() {
		return this.loNextPacket;
	}

	public void setLoNextPacket(int loNextPacket) {
		this.loNextPacket = loNextPacket;
	}

	public String getLoOperation() {
		return this.loOperation;
	}

	public void setLoOperation(String loOperation) {
		this.loOperation = loOperation;
	}

	public String getLoOperationDetail() {
		return this.loOperationDetail;
	}

	public void setLoOperationDetail(String loOperationDetail) {
		this.loOperationDetail = loOperationDetail;
	}

	public int getLoPreviousPacket() {
		return this.loPreviousPacket;
	}

	public void setLoPreviousPacket(int loPreviousPacket) {
		this.loPreviousPacket = loPreviousPacket;
	}

	public void setLousr(int lousr) {
		this.lousr = lousr;
	}

	public int getLousr() {
		return lousr;
	}

}