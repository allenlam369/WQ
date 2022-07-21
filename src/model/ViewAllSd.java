package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the view_all_sd database table.
 * 
 */
//@Entity
@Table(name="view_all_sd")
@NamedQuery(name="ViewAllSd.findAll", query="SELECT v FROM ViewAllSd v")
public class ViewAllSd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal sd;

	public ViewAllSd() {
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getSd() {
		return this.sd;
	}

	public void setSd(BigDecimal sd) {
		this.sd = sd;
	}

}