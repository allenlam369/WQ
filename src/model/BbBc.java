package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bb_bc_s database table.
 * 
 */
@Entity
@Table(name="bb_bc_s")
@NamedQuery(name="BbBc.findAll", query="SELECT b FROM BbBc b")
public class BbBc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bb_visit_id")
	private String bbVisitId;

	private BigDecimal abundance;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="sp_name")
	private String spName;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal weight;

	//bi-directional many-to-one association to BbStation
	@ManyToOne
	@JoinColumn(name="station_id")
	private BbStation bbStation;

	public BbBc() {
	}

	public String getBbVisitId() {
		return this.bbVisitId;
	}

	public void setBbVisitId(String bbVisitId) {
		this.bbVisitId = bbVisitId;
	}

	public BigDecimal getAbundance() {
		return this.abundance;
	}

	public void setAbundance(BigDecimal abundance) {
		this.abundance = abundance;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public BigDecimal getValidCode() {
		return this.validCode;
	}

	public void setValidCode(BigDecimal validCode) {
		this.validCode = validCode;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getValidUser() {
		return this.validUser;
	}

	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BbStation getBbStation() {
		return this.bbStation;
	}

	public void setBbStation(BbStation bbStation) {
		this.bbStation = bbStation;
	}

}