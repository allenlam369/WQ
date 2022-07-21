package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_m_mctd database table.
 * 
 */
//@Entity
@Table(name="db_m_mctd")
@NamedQuery(name="DbMMctd.findAll", query="SELECT d FROM DbMMctd d")
public class DbMMctd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ctd_id")
	private BigDecimal ctdId;

	private Timestamp mdate;

	@Column(name="profile_id")
	private String profileId;

	private String scode;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	@Column(name="w_depth")
	private BigDecimal wDepth;

	public DbMMctd() {
	}

	public BigDecimal getCtdId() {
		return this.ctdId;
	}

	public void setCtdId(BigDecimal ctdId) {
		this.ctdId = ctdId;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getProfileId() {
		return this.profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public BigDecimal getStationId() {
		return this.stationId;
	}

	public void setStationId(BigDecimal stationId) {
		this.stationId = stationId;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

	public BigDecimal getWDepth() {
		return this.wDepth;
	}

	public void setWDepth(BigDecimal wDepth) {
		this.wDepth = wDepth;
	}

}