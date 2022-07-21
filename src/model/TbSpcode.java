package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_spcode database table.
 * 
 */
//@Entity
@Table(name="tb_spcode")
@NamedQuery(name="TbSpcode.findAll", query="SELECT t FROM TbSpcode t")
public class TbSpcode implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sampling;

	@Column(name="sp_id")
	private BigDecimal spId;

	@Column(name="sp_name")
	private String spName;

	@Column(name="tb_spcode_id")
	private String tbSpcodeId;

	@Column(name="tissue_type")
	private String tissueType;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TbSpcode() {
	}

	public String getSampling() {
		return this.sampling;
	}

	public void setSampling(String sampling) {
		this.sampling = sampling;
	}

	public BigDecimal getSpId() {
		return this.spId;
	}

	public void setSpId(BigDecimal spId) {
		this.spId = spId;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getTbSpcodeId() {
		return this.tbSpcodeId;
	}

	public void setTbSpcodeId(String tbSpcodeId) {
		this.tbSpcodeId = tbSpcodeId;
	}

	public String getTissueType() {
		return this.tissueType;
	}

	public void setTissueType(String tissueType) {
		this.tissueType = tissueType;
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

}