package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tw_clab_pbde database table.
 * 
 */
@Embeddable
public class TwClabPbdePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="twvisit_id")
	private String twvisitId;

	private String type;

	public TwClabPbdePK() {
	}
	public String getTwvisitId() {
		return this.twvisitId;
	}
	public void setTwvisitId(String twvisitId) {
		this.twvisitId = twvisitId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TwClabPbdePK)) {
			return false;
		}
		TwClabPbdePK castOther = (TwClabPbdePK)other;
		return 
			this.twvisitId.equals(castOther.twvisitId)
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.twvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}