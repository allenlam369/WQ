package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_user_log database table.
 * 
 */
//@Entity
@Table(name="db_user_log")
@NamedQuery(name="DbUserLog.findAll", query="SELECT d FROM DbUserLog d")
public class DbUserLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="log_ip")
	private String logIp;

	@Column(name="log_size")
	private BigDecimal logSize;

	@Column(name="log_table")
	private String logTable;

	@Column(name="log_time")
	private Timestamp logTime;

	@Column(name="log_timestamp")
	private String logTimestamp;

	@Column(name="log_type")
	private String logType;

	@Column(name="log_user")
	private String logUser;

	public DbUserLog() {
	}

	public String getLogIp() {
		return this.logIp;
	}

	public void setLogIp(String logIp) {
		this.logIp = logIp;
	}

	public BigDecimal getLogSize() {
		return this.logSize;
	}

	public void setLogSize(BigDecimal logSize) {
		this.logSize = logSize;
	}

	public String getLogTable() {
		return this.logTable;
	}

	public void setLogTable(String logTable) {
		this.logTable = logTable;
	}

	public Timestamp getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public String getLogTimestamp() {
		return this.logTimestamp;
	}

	public void setLogTimestamp(String logTimestamp) {
		this.logTimestamp = logTimestamp;
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getLogUser() {
		return this.logUser;
	}

	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

}