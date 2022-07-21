package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ds_glab_cdd database table.
 * 
 */
@Embeddable
public class DsGlabCddPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dsvisit_id")
	private String dsvisitId;

	private String type;

	public DsGlabCddPK() {
	}
	public String getDsvisitId() {
		return this.dsvisitId;
	}
	public void setDsvisitId(String dsvisitId) {
		this.dsvisitId = dsvisitId;
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
		if (!(other instanceof DsGlabCddPK)) {
			return false;
		}
		DsGlabCddPK castOther = (DsGlabCddPK)other;
		return 
			this.dsvisitId.equals(castOther.dsvisitId)
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dsvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}