package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_sediment_glabn1 database table.
 * 
 */
//@Entity
@Table(name="marine_sediment_glabn1")
@NamedQuery(name="MarineSedimentGlabn1.findAll", query="SELECT m FROM MarineSedimentGlabn1 m")
public class MarineSedimentGlabn1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cn;

	private BigDecimal cod;

	private BigDecimal dwr;

	private BigDecimal ins;

	@Column(name="l_cn")
	private String lCn;

	@Column(name="l_cod")
	private String lCod;

	@Column(name="l_ins")
	private String lIns;

	@Column(name="l_nh")
	private String lNh;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_sg")
	private String lSg;

	@Column(name="l_tc")
	private String lTc;

	@Column(name="l_tic")
	private String lTic;

	@Column(name="l_tkn")
	private String lTkn;

	@Column(name="l_toc")
	private String lToc;

	@Column(name="l_tp")
	private String lTp;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_tvs")
	private String lTvs;

	private Timestamp mdate;

	private BigDecimal nh;

	private BigDecimal ph;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private BigDecimal sg;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal tc;

	private BigDecimal tic;

	private BigDecimal tkn;

	private BigDecimal toc;

	private BigDecimal tp;

	private BigDecimal ts;

	private BigDecimal tvs;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public MarineSedimentGlabn1() {
	}

	public BigDecimal getCn() {
		return this.cn;
	}

	public void setCn(BigDecimal cn) {
		this.cn = cn;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getDwr() {
		return this.dwr;
	}

	public void setDwr(BigDecimal dwr) {
		this.dwr = dwr;
	}

	public BigDecimal getIns() {
		return this.ins;
	}

	public void setIns(BigDecimal ins) {
		this.ins = ins;
	}

	public String getLCn() {
		return this.lCn;
	}

	public void setLCn(String lCn) {
		this.lCn = lCn;
	}

	public String getLCod() {
		return this.lCod;
	}

	public void setLCod(String lCod) {
		this.lCod = lCod;
	}

	public String getLIns() {
		return this.lIns;
	}

	public void setLIns(String lIns) {
		this.lIns = lIns;
	}

	public String getLNh() {
		return this.lNh;
	}

	public void setLNh(String lNh) {
		this.lNh = lNh;
	}

	public String getLPh() {
		return this.lPh;
	}

	public void setLPh(String lPh) {
		this.lPh = lPh;
	}

	public String getLSg() {
		return this.lSg;
	}

	public void setLSg(String lSg) {
		this.lSg = lSg;
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

	public String getLTkn() {
		return this.lTkn;
	}

	public void setLTkn(String lTkn) {
		this.lTkn = lTkn;
	}

	public String getLToc() {
		return this.lToc;
	}

	public void setLToc(String lToc) {
		this.lToc = lToc;
	}

	public String getLTp() {
		return this.lTp;
	}

	public void setLTp(String lTp) {
		this.lTp = lTp;
	}

	public String getLTs() {
		return this.lTs;
	}

	public void setLTs(String lTs) {
		this.lTs = lTs;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getNh() {
		return this.nh;
	}

	public void setNh(BigDecimal nh) {
		this.nh = nh;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public BigDecimal getSg() {
		return this.sg;
	}

	public void setSg(BigDecimal sg) {
		this.sg = sg;
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

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public BigDecimal getTp() {
		return this.tp;
	}

	public void setTp(BigDecimal tp) {
		this.tp = tp;
	}

	public BigDecimal getTs() {
		return this.ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
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