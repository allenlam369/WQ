package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mw_sample_mark database table.
 * 
 */
//@Entity
@Table(name="mw_sample_mark")
@NamedQuery(name="MwSampleMark.findAll", query="SELECT m FROM MwSampleMark m")
public class MwSampleMark implements Serializable {
	private static final long serialVersionUID = 1L;

	private String lab;

	@Column(name="sample_mark")
	private String sampleMark;

	private String station;

	public MwSampleMark() {
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