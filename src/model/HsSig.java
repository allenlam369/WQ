package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_sig database table.
 * 
 */
//@Entity
@Table(name="hs_sig")
@NamedQuery(name="HsSig.findAll", query="SELECT h FROM HsSig h")
public class HsSig implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fieldname;

	@Column(name="report_type")
	private String reportType;

	private double sig;

	public HsSig() {
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