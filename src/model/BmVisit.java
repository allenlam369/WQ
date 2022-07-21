package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_visit database table.
 * 
 */
@Entity
@Table(name="bm_visit")
@NamedQuery(name="BmVisit.findAll", query="SELECT b FROM BmVisit b")
public class BmVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Id
	private Integer id;

	private Timestamp mdate;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	private BigDecimal stime;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to BmBeach
	@ManyToOne
	@JoinColumn(name="site_id", referencedColumnName="site_id")
	private BmBeach bmBeach;

	public BmVisit() {
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public Integer getValidCode() {
		return this.validCode;
	}

	public void setValidCode(Integer validCode) {
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

	public BmBeach getBmBeach() {
		return this.bmBeach;
	}

	public void setBmBeach(BmBeach bmBeach) {
		this.bmBeach = bmBeach;
	}

}