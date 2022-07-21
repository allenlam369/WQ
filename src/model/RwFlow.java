package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_flow database table.
 * 
 */
@Entity
@Table(name="rw_flow")
@NamedQuery(name="RwFlow.findAll", query="SELECT r FROM RwFlow r")
public class RwFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RwFlowPK id;

	private BigDecimal depth;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal vel;

	private BigDecimal width;

	public RwFlow() {
	}

	public RwFlowPK getId() {
		return this.id;
	}

	public void setId(RwFlowPK id) {
		this.id = id;
	}

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
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