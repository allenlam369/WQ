package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_bt_pl database table.
 * 
 */
//@Entity
@Table(name="sr_bt_pl")
@NamedQuery(name="SrBtPl.findAll", query="SELECT s FROM SrBtPl s")
public class SrBtPl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	@Column(name="display_dec")
	private BigDecimal displayDec;

	@Column(name="display_int")
	private BigDecimal displayInt;

	@Column(name="low_det_limit")
	private BigDecimal lowDetLimit;

	@Column(name="para_code")
	private String paraCode;

	@Column(name="para_desc")
	private String paraDesc;

	@Column(name="para_id")
	private BigDecimal paraId;

	@Column(name="para_unit")
	private String paraUnit;

	private String status;

	@Column(name="test_method")
	private String testMethod;

	@Column(name="up_date")
	private String upDate;

	@Column(name="up_det_limit")
	private BigDecimal upDetLimit;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public SrBtPl() {
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

	public BigDecimal getDisplayDec() {
		return this.displayDec;
	}

	public void setDisplayDec(BigDecimal displayDec) {
		this.displayDec = displayDec;
	}

	public BigDecimal getDisplayInt() {
		return this.displayInt;
	}

	public void setDisplayInt(BigDecimal displayInt) {
		this.displayInt = displayInt;
	}

	public BigDecimal getLowDetLimit() {
		return this.lowDetLimit;
	}

	public void setLowDetLimit(BigDecimal lowDetLimit) {
		this.lowDetLimit = lowDetLimit;
	}

	public String getParaCode() {
		return this.paraCode;
	}

	public void setParaCode(String paraCode) {
		this.paraCode = paraCode;
	}

	public String getParaDesc() {
		return this.paraDesc;
	}

	public void setParaDesc(String paraDesc) {
		this.paraDesc = paraDesc;
	}

	public BigDecimal getParaId() {
		return this.paraId;
	}

	public void setParaId(BigDecimal paraId) {
		this.paraId = paraId;
	}

	public String getParaUnit() {
		return this.paraUnit;
	}

	public void setParaUnit(String paraUnit) {
		this.paraUnit = paraUnit;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestMethod() {
		return this.testMethod;
	}

	public void setTestMethod(String testMethod) {
		this.testMethod = testMethod;
	}

	public String getUpDate() {
		return this.upDate;
	}

	public void setUpDate(String upDate) {
		this.upDate = upDate;
	}

	public BigDecimal getUpDetLimit() {
		return this.upDetLimit;
	}

	public void setUpDetLimit(BigDecimal upDetLimit) {
		this.upDetLimit = upDetLimit;
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