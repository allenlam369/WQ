package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_bt_spcode database table.
 * 
 */
//@Entity
@Table(name="sr_bt_spcode")
@NamedQuery(name="SrBtSpcode.findAll", query="SELECT s FROM SrBtSpcode s")
public class SrBtSpcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bt_spcode_id")
	private String btSpcodeId;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	private String sampling;

	@Column(name="sp_id")
	private BigDecimal spId;

	@Column(name="sp_name")
	private String spName;

	@Column(name="tissue_type")
	private String tissueType;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public SrBtSpcode() {
	}

	public String getBtSpcodeId() {
		return this.btSpcodeId;
	}

	public void setBtSpcodeId(String btSpcodeId) {
		this.btSpcodeId = btSpcodeId;
	}

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUser() {
		return this.deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
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