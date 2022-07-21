package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_sediment_glabn1 database table.
 * 
 */
//@Entity
@Table(name="toxic_sediment_glabn1")
@NamedQuery(name="ToxicSedimentGlabn1.findAll", query="SELECT t FROM ToxicSedimentGlabn1 t")
public class ToxicSedimentGlabn1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_tc")
	private String lTc;

	@Column(name="l_tic")
	private String lTic;

	@Column(name="l_toc")
	private String lToc;

	private Timestamp mdate;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal tc;

	private BigDecimal tic;

	private BigDecimal toc;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public ToxicSedimentGlabn1() {
	}

	public String getLTc() {
		return this.lTc;
	}

	public void setLTc(String lTc) {
		this.lTc = lTc;
	}

	public String getLTic() {
		return this.lTic;
	}

	public void setLTic(String lTic) {
		this.lTic = lTic;
	}

	public String getLToc() {
		return this.lToc;
	}

	public void setLToc(String lToc) {
		this.lToc = lToc;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public BigDecimal getTic() {
		return this.tic;
	}

	public void setTic(BigDecimal tic) {
		this.tic = tic;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getViewNo() {
		return this.viewNo;
	}

	public void setViewNo(BigDecimal viewNo) {
		this.viewNo = viewNo;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}