package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mw_seacat database table.
 * 
 */
@Embeddable
public class MwSeacatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private long depth;

	public MwSeacatPK() {
	}
	public String getMwvisitId() {
		return this.mwvisitId;
	}
	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}
	public long getDepth() {
		return this.depth;
	}
	public void setDepth(long depth) {
		this.depth = depth;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MwSeacatPK)) {
			return false;
		}
		MwSeacatPK castOther = (MwSeacatPK)other;
		return 
			this.mwvisitId.equals(castOther.mwvisitId)
			&& (this.depth == castOther.depth);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mwvisitId.hashCode();
		hash = hash * prime + ((int) (this.depth ^ (this.depth >>> 32)));
		
		return hash;
	}
}