package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the benthic database table.
 * 
 */
//@Entity
@NamedQuery(name="Benthic.findAll", query="SELECT b FROM Benthic b")
public class Benthic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="project_id")
	private BigDecimal projectId;

	@Column(name="security_code")
	private BigDecimal securityCode;

	@Column(name="table_dec")
	private String tableDec;

	@Column(name="table_name")
	private String tableName;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public Benthic() {
	}

	public BigDecimal getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public BigDecimal getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(BigDecimal securityCode) {
		this.securityCode = securityCode;
	}

	public String getTableDec() {
		return this.tableDec;
	}

	public void setTableDec(String tableDec) {
		this.tableDec = tableDec;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
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