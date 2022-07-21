package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bm_parameter database table.
 * 
 */
@Embeddable
public class BmParameterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="parameter_set")
	private String parameterSet;

	@Column(name="parameter_value")
	private long parameterValue;

	public BmParameterPK() {
	}
	public String getParameterSet() {
		return this.parameterSet;
	}
	public void setParameterSet(String parameterSet) {
		this.parameterSet = parameterSet;
	}
	public long getParameterValue() {
		return this.parameterValue;
	}
	public void setParameterValue(long parameterValue) {
		this.parameterValue = parameterValue;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BmParameterPK)) {
			return false;
		}
		BmParameterPK castOther = (BmParameterPK)other;
		return 
			this.parameterSet.equals(castOther.parameterSet)
			&& (this.parameterValue == castOther.parameterValue);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.parameterSet.hashCode();
		hash = hash * prime + ((int) (this.parameterValue ^ (this.parameterValue >>> 32)));
		
		return hash;
	}
}