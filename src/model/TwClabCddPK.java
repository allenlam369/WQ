package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tw_clab_cdd database table.
 * 
 */
@Embeddable
public class TwClabCddPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="twvisit_id")
	private String twvisitId;

	private String type;

	@Column(name="teq_type")
	private String teqType;

	public TwClabCddPK() {
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
	public String getTeqType() {
		return this.teqType;
	}
	public void setTeqType(String teqType) {
		this.teqType = teqType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TwClabCddPK)) {
			return false;
		}
		TwClabCddPK castOther = (TwClabCddPK)other;
		return 
			this.twvisitId.equals(castOther.twvisitId)
			&& this.type.equals(castOther.type)
			&& this.teqType.equals(castOther.teqType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.twvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		hash = hash * prime + this.teqType.hashCode();
		
		return hash;
	}
}