package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bm_rainfall database table.
 * 
 */
@Embeddable
public class BmRainfallPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date sdatetime;

	@Column(name="rain_station_code")
	private String rainStationCode;

	public BmRainfallPK() {
	}
	public java.util.Date getSdatetime() {
		return this.sdatetime;
	}
	public void setSdatetime(java.util.Date sdatetime) {
		this.sdatetime = sdatetime;
	}
	public String getRainStationCode() {
		return this.rainStationCode;
	}
	public void setRainStationCode(String rainStationCode) {
		this.rainStationCode = rainStationCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BmRainfallPK)) {
			return false;
		}
		BmRainfallPK castOther = (BmRainfallPK)other;
		return 
			this.sdatetime.equals(castOther.sdatetime)
			&& this.rainStationCode.equals(castOther.rainStationCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sdatetime.hashCode();
		hash = hash * prime + this.rainStationCode.hashCode();
		
		return hash;
	}
}