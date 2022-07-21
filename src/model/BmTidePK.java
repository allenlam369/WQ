package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bm_tide database table.
 * 
 */
@Embeddable
public class BmTidePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date sdatetime;

	@Column(name="tide_station_code")
	private String tideStationCode;

	public BmTidePK() {
	}
	public java.util.Date getSdatetime() {
		return this.sdatetime;
	}
	public void setSdatetime(java.util.Date sdatetime) {
		this.sdatetime = sdatetime;
	}
	public String getTideStationCode() {
		return this.tideStationCode;
	}
	public void setTideStationCode(String tideStationCode) {
		this.tideStationCode = tideStationCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BmTidePK)) {
			return false;
		}
		BmTidePK castOther = (BmTidePK)other;
		return 
			this.sdatetime.equals(castOther.sdatetime)
			&& this.tideStationCode.equals(castOther.tideStationCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sdatetime.hashCode();
		hash = hash * prime + this.tideStationCode.hashCode();
		
		return hash;
	}
}