package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the column_information database table.
 * 
 */
//@Entity
@Table(name="column_information")
@NamedQuery(name="ColumnInformation.findAll", query="SELECT c FROM ColumnInformation c")
public class ColumnInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	private String chinese;

	@Column(name="column_name")
	private String columnName;

	@Column(name="decimal_place")
	private BigDecimal decimalPlace;

	private String description;

	private Boolean display;

	@Column(name="effective_date")
	private Timestamp effectiveDate;

	@Column(name="lower_limit")
	private BigDecimal lowerLimit;

	private String status;

	@Column(name="table_name")
	private String tableName;

	@Column(name="test_method")
	private String testMethod;

	private String type;

	private String unit;

	@Column(name="upper_limit")
	private BigDecimal upperLimit;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public ColumnInformation() {
	}

	public String getChinese() {
		return this.chinese;
	}

	public void setChinese(String chinese) {
		this.chinese = chinese;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public BigDecimal getDecimalPlace() {
		return this.decimalPlace;
	}

	public void setDecimalPlace(BigDecimal decimalPlace) {
		this.decimalPlace = decimalPlace;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDisplay() {
		return this.display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getLowerLimit() {
		return this.lowerLimit;
	}

	public void setLowerLimit(BigDecimal lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTestMethod() {
		return this.testMethod;
	}

	public void setTestMethod(String testMethod) {
		this.testMethod = testMethod;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getUpperLimit() {
		return this.upperLimit;
	}

	public void setUpperLimit(BigDecimal upperLimit) {
		this.upperLimit = upperLimit;
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