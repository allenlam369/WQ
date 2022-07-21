package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_sample_mark database table.
 * 
 */
//@Entity
@Table(name="hs_sample_mark")
@NamedQuery(name="HsSampleMark.findAll", query="SELECT h FROM HsSampleMark h")
public class HsSampleMark implements Serializable {
	private static final long serialVersionUID = 1L;

	private String lab;

	@Column(name="sample_mark")
	private String sampleMark;

	private String station;

	public HsSampleMark() {
	}

	public String getLab() {
		return this.lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

}