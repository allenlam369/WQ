package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the data_insert_info database table.
 * 
 */
@Entity
@Table(name="data_insert_info")
@NamedQuery(name="DataInsertInfo.findAll", query="SELECT d FROM DataInsertInfo d")
public class DataInsertInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="match_id")
	private long matchId;

	@Column(name="column_name")
	private String columnName;

	@Column(name="sou_column_name")
	private String souColumnName;

	@Column(name="sou_table_name")
	private String souTableName;

	private String status;

	@Column(name="table_name")
	private String tableName;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public DataInsertInfo() {
	}

	public long getMatchId() {
		return this.matchId;
	}

	public void setMatchId(long matchId) {
		this.matchId = matchId;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getSouColumnName() {
		return this.souColumnName;
	}

	public void setSouColumnName(String souColumnName) {
		this.souColumnName = souColumnName;
	}

	public String getSouTableName() {
		return this.souTableName;
	}

	public void setSouTableName(String souTableName) {
		this.souTableName = souTableName;
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