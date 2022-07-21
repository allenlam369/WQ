package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_flow_bk database table.
 * 
 */
//@Entity
@Table(name="rw_flow_bk")
@NamedQuery(name="RwFlowBk.findAll", query="SELECT r FROM RwFlowBk r")
public class RwFlowBk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="data_no")
	private BigDecimal dataNo;

	private BigDecimal depth;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal vel;

	private BigDecimal width;

	public RwFlowBk() {
	}

	public BigDecimal getDataNo() {
		return this.dataNo;
	}

	public void setDataNo(BigDecimal dataNo) {
		this.dataNo = dataNo;
	}

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
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

	public BigDecimal getVel() {
		return this.vel;
	}

	public void setVel(BigDecimal vel) {
		this.vel = vel;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

}