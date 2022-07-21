package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mw_sig database table.
 * 
 */
//@Entity
@Table(name="mw_sig")
@NamedQuery(name="MwSig.findAll", query="SELECT m FROM MwSig m")
public class MwSig implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fieldname;

	@Column(name="report_type")
	private String reportType;

	private double sig;

	public MwSig() {
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public double getSig() {
		return this.sig;
	}

	public void setSig(double sig) {
		this.sig = sig;
	}

}