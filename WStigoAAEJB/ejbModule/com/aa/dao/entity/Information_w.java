package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Information_ws database table.
 * 
 */
@Entity
@Table(name="Information_ws")
@NamedQuery(name=Information_w.queryInfo,
			query="SELECT c FROM Information_w c WHERE c.inMsisdn = :msisdn")
public class Information_w implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String queryInfo = "queryinfo";

	/**
	 * Cambio de prueba
	 */
	@Id
	@Column(name="in_msisdn")
	private long inMsisdn;

	@Column(name="in_account_no")
	private int inAccountNo;

	@Column(name="in_est_cta")
	private String inEstCta;

	@Column(name="in_est_pro")
	private String inEstPro;

    @Temporal( TemporalType.DATE)
	@Column(name="in_fec_con_o_inac_pro")
	private Date inFecConOInacPro;

    @Temporal( TemporalType.DATE)
	@Column(name="in_fec_crea_cta")
	private Date inFecCreaCta;

    @Temporal( TemporalType.DATE)
	@Column(name="in_fec_crea_pro")
	private Date inFecCreaPro;

	@Column(name="in_identification_name")
	private String inIdentificationName;

	@Column(name="in_identification_number")
	private String inIdentificationNumber;

	@Column(name="in_identification_type")
	private String inIdentificationType;

    @Lob()
	@Column(name="in_name_pro")
	private String inNamePro;

	@Column(name="in_package_active")
	private String inPackageActive;

	@Column(name="in_package_actual")
	private int inPackageActual;

	@Column(name="in_poid_plan")
	private String inPoidPlan;
	
	@Column(name="in_ciclo")
	private int inCiclo;

    public Information_w() {
    }

	public long getInMsisdn() {
		return this.inMsisdn;
	}

	public void setInMsisdn(long inMsisdn) {
		this.inMsisdn = inMsisdn;
	}

	public int getInAccountNo() {
		return this.inAccountNo;
	}

	public void setInAccountNo(int inAccountNo) {
		this.inAccountNo = inAccountNo;
	}

	public String getInEstCta() {
		return this.inEstCta;
	}

	public void setInEstCta(String inEstCta) {
		this.inEstCta = inEstCta;
	}

	public String getInEstPro() {
		return this.inEstPro;
	}

	public void setInEstPro(String inEstPro) {
		this.inEstPro = inEstPro;
	}

	public Date getInFecConOInacPro() {
		return this.inFecConOInacPro;
	}

	public void setInFecConOInacPro(Date inFecConOInacPro) {
		this.inFecConOInacPro = inFecConOInacPro;
	}

	public Date getInFecCreaCta() {
		return this.inFecCreaCta;
	}

	public void setInFecCreaCta(Date inFecCreaCta) {
		this.inFecCreaCta = inFecCreaCta;
	}

	public Date getInFecCreaPro() {
		return this.inFecCreaPro;
	}

	public void setInFecCreaPro(Date inFecCreaPro) {
		this.inFecCreaPro = inFecCreaPro;
	}

	public String getInIdentificationName() {
		return this.inIdentificationName;
	}

	public void setInIdentificationName(String inIdentificationName) {
		this.inIdentificationName = inIdentificationName;
	}

	public String getInIdentificationNumber() {
		return this.inIdentificationNumber;
	}

	public void setInIdentificationNumber(String inIdentificationNumber) {
		this.inIdentificationNumber = inIdentificationNumber;
	}

	public String getInIdentificationType() {
		return this.inIdentificationType;
	}

	public void setInIdentificationType(String inIdentificationType) {
		this.inIdentificationType = inIdentificationType;
	}

	public String getInNamePro() {
		return this.inNamePro;
	}

	public void setInNamePro(String inNamePro) {
		this.inNamePro = inNamePro;
	}

	public String getInPackageActive() {
		return this.inPackageActive;
	}

	public void setInPackageActive(String inPackageActive) {
		this.inPackageActive = inPackageActive;
	}

	public int getInPackageActual() {
		return this.inPackageActual;
	}

	public void setInPackageActual(int inPackageActual) {
		this.inPackageActual = inPackageActual;
	}

	public String getInPoidPlan() {
		return this.inPoidPlan;
	}

	public void setInPoidPlan(String inPoidPlan) {
		this.inPoidPlan = inPoidPlan;
	}

	public void setInCiclo(int inCiclo) {
		this.inCiclo = inCiclo;
	}

	public int getInCiclo() {
		return inCiclo;
	}

}