package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cancellation database table.
 * 
 */
@Entity
@Table(name="cancellation")
@NamedQuery(name=Cancellation.selectall,
			query="SELECT c FROM Cancellation c")
public class Cancellation implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String  selectall="selectall";
	@Id
	@Column(name="ca_id")
	private int caId;

    @Lob()
	@Column(name="ca_reason_cancellation")
	private String caReasonCancellation;

    public Cancellation() {
    }

	public int getCaId() {
		return this.caId;
	}

	public void setCaId(int caId) {
		this.caId = caId;
	}

	public String getCaReasonCancellation() {
		return this.caReasonCancellation;
	}

	public void setCaReasonCancellation(String caReasonCancellation) {
		this.caReasonCancellation = caReasonCancellation;
	}

}