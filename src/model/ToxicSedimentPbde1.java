package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_sediment_pbde1 database table.
 * 
 */
//@Entity
@Table(name="toxic_sediment_pbde1")
@NamedQuery(name="ToxicSedimentPbde1.findAll", query="SELECT t FROM ToxicSedimentPbde1 t")
public class ToxicSedimentPbde1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_pbde100")
	private String lPbde100;

	@Column(name="l_pbde153")
	private String lPbde153;

	@Column(name="l_pbde154")
	private String lPbde154;

	@Column(name="l_pbde17")
	private String lPbde17;

	@Column(name="l_pbde183")
	private String lPbde183;

	@Column(name="l_pbde197")
	private String lPbde197;

	@Column(name="l_pbde209")
	private String lPbde209;

	@Column(name="l_pbde28")
	private String lPbde28;

	@Column(name="l_pbde47")
	private String lPbde47;

	@Column(name="l_pbde99")
	private String lPbde99;

	private Timestamp mdate;

	private BigDecimal pbde;

	private BigDecimal pbde100;

	private BigDecimal pbde153;

	private BigDecimal pbde154;

	private BigDecimal pbde17;

	private BigDecimal pbde183;

	private BigDecimal pbde197;

	private BigDecimal pbde209;

	private BigDecimal pbde28;

	private BigDecimal pbde47;

	private BigDecimal pbde99;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public ToxicSedimentPbde1() {
	}

	public String getLPbde100() {
		return this.lPbde100;
	}

	public void setLPbde100(String lPbde100) {
		this.lPbde100 = lPbde100;
	}

	public String getLPbde153() {
		return this.lPbde153;
	}

	public void setLPbde153(String lPbde153) {
		this.lPbde153 = lPbde153;
	}

	public String getLPbde154() {
		return this.lPbde154;
	}

	public void setLPbde154(String lPbde154) {
		this.lPbde154 = lPbde154;
	}

	public String getLPbde17() {
		return this.lPbde17;
	}

	public void setLPbde17(String lPbde17) {
		this.lPbde17 = lPbde17;
	}

	public String getLPbde183() {
		return this.lPbde183;
	}

	public void setLPbde183(String lPbde183) {
		this.lPbde183 = lPbde183;
	}

	public String getLPbde197() {
		return this.lPbde197;
	}

	public void setLPbde197(String lPbde197) {
		this.lPbde197 = lPbde197;
	}

	public String getLPbde209() {
		return this.lPbde209;
	}

	public void setLPbde209(String lPbde209) {
		this.lPbde209 = lPbde209;
	}

	public String getLPbde28() {
		return this.lPbde28;
	}

	public void setLPbde28(String lPbde28) {
		this.lPbde28 = lPbde28;
	}

	public String getLPbde47() {
		return this.lPbde47;
	}

	public void setLPbde47(String lPbde47) {
		this.lPbde47 = lPbde47;
	}

	public String getLPbde99() {
		return this.lPbde99;
	}

	public void setLPbde99(String lPbde99) {
		this.lPbde99 = lPbde99;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPbde() {
		return this.pbde;
	}

	public void setPbde(BigDecimal pbde) {
		this.pbde = pbde;
	}

	public BigDecimal getPbde100() {
		return this.pbde100;
	}

	public void setPbde100(BigDecimal pbde100) {
		this.pbde100 = pbde100;
	}

	public BigDecimal getPbde153() {
		return this.pbde153;
	}

	public void setPbde153(BigDecimal pbde153) {
		this.pbde153 = pbde153;
	}

	public BigDecimal getPbde154() {
		return this.pbde154;
	}

	public void setPbde154(BigDecimal pbde154) {
		this.pbde154 = pbde154;
	}

	public BigDecimal getPbde17() {
		return this.pbde17;
	}

	public void setPbde17(BigDecimal pbde17) {
		this.pbde17 = pbde17;
	}

	public BigDecimal getPbde183() {
		return this.pbde183;
	}

	public void setPbde183(BigDecimal pbde183) {
		this.pbde183 = pbde183;
	}

	public BigDecimal getPbde197() {
		return this.pbde197;
	}

	public void setPbde197(BigDecimal pbde197) {
		this.pbde197 = pbde197;
	}

	public BigDecimal getPbde209() {
		return this.pbde209;
	}

	public void setPbde209(BigDecimal pbde209) {
		this.pbde209 = pbde209;
	}

	public BigDecimal getPbde28() {
		return this.pbde28;
	}

	public void setPbde28(BigDecimal pbde28) {
		this.pbde28 = pbde28;
	}

	public BigDecimal getPbde47() {
		return this.pbde47;
	}

	public void setPbde47(BigDecimal pbde47) {
		this.pbde47 = pbde47;
	}

	public BigDecimal getPbde99() {
		return this.pbde99;
	}

	public void setPbde99(BigDecimal pbde99) {
		this.pbde99 = pbde99;
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