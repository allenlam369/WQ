package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_clab database table.
 * 
 */
@Embeddable
public class TbClabPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	private String type;

	public TbClabPK() {
	}
	public String getTbvisitId() {
		return this.tbvisitId;
	}
	public void setTbvisitId(String tbvisitId) {
		this.tbvisitId = tbvisitId;
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
		if (!(other instanceof TbClabPK)) {
			return false;
		}
		TbClabPK castOther = (TbClabPK)other;
		return 
			this.tbvisitId.equals(castOther.tbvisitId)
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tbvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}