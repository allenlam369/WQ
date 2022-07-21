package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ts_glab_pah database table.
 * 
 */
@Embeddable
public class TsGlabPahPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tsvisit_id")
	private String tsvisitId;

	private String type;

	public TsGlabPahPK() {
	}
	public String getTsvisitId() {
		return this.tsvisitId;
	}
	public void setTsvisitId(String tsvisitId) {
		this.tsvisitId = tsvisitId;
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
		if (!(other instanceof TsGlabPahPK)) {
			return false;
		}
		TsGlabPahPK castOther = (TsGlabPahPK)other;
		return 
			this.tsvisitId.equals(castOther.tsvisitId)
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tsvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}