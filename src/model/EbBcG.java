package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the eb_bc_g_s database table.
 * 
 */
//@Entity
@Table(name="eb_bc_g_s")
@NamedQuery(name="EbBcG.findAll", query="SELECT e FROM EbBcG e")
public class EbBcG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bio_vol")
	private BigDecimal bioVol;

	private BigDecimal density;

	private double month;

	@Column(name="no_sp")
	private Long noSp;

	private BigDecimal scan;

	@Column(name="sp_group")
	private String spGroup;

	@Column(name="station_id")
	private String stationId;

	public EbBcG() {
	}

	public BigDecimal getBioVol() {
		return this.bioVol;
	}

	public void setBioVol(BigDecimal bioVol) {
		this.bioVol = bioVol;
	}

	public BigDecimal getDensity() {
		return this.density;
	}

	public void setDensity(BigDecimal density) {
		this.density = density;
	}

	public double getMonth() {
		return this.month;
	}

	public void setMonth(double month) {
		this.month = month;
	}

	public Long getNoSp() {
		return this.noSp;
	}

	public void setNoSp(Long noSp) {
		this.noSp = noSp;
	}

	public BigDecimal getScan() {
		return this.scan;
	}

	public void setScan(BigDecimal scan) {
		this.scan = scan;
	}

	public String getSpGroup() {
		return this.spGroup;
	}

	public void setSpGroup(String spGroup) {
		this.spGroup = spGroup;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

}