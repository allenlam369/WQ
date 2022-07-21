package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mw_nh3_a database table.
 * 
 */
//@Entity
@Table(name="mw_nh3_a")
@NamedQuery(name="MwNh3A.findAll", query="SELECT m FROM MwNh3A m")
public class MwNh3A implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal nh3;

	public MwNh3A() {
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getNh3() {
		return this.nh3;
	}

	public void setNh3(BigDecimal nh3) {
		this.nh3 = nh3;
	}

}