package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_mw_quality database table.
 * 
 */
//@Entity
@Table(name="db_mw_quality")
@NamedQuery(name="DbMwQuality.findAll", query="SELECT d FROM DbMwQuality d")
public class DbMwQuality implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod;

	@Column(name="chl_a")
	private BigDecimal chlA;

	private BigDecimal cl;

	private BigDecimal cod;

	@Column(name="cu_diss")
	private BigDecimal cuDiss;

	@Column(name="cu_tot")
	private BigDecimal cuTot;

	@Column(name="depth_code")
	private String depthCode;

	private Timestamp mdate;

	@Column(name="nh3_n")
	private BigDecimal nh3N;

	@Column(name="no2_n")
	private BigDecimal no2N;

	@Column(name="no3_n")
	private BigDecimal no3N;

	@Column(name="po4_p")
	private BigDecimal po4P;

	@Column(name="sample_depth")
	private BigDecimal sampleDepth;

	@Column(name="sample_no")
	private String sampleNo;

	private String scode;

	private BigDecimal si;

	private BigDecimal ss;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	private BigDecimal tkn;

	private BigDecimal tn;

	private BigDecimal toc;

	private BigDecimal tp;

	public DbMwQuality() {
	}

	public BigDecimal getBod() {
		return this.bod;
	}

	public void setBod(BigDecimal bod) {
		this.bod = bod;
	}

	public BigDecimal getChlA() {
		return this.chlA;
	}

	public void setChlA(BigDecimal chlA) {
		this.chlA = chlA;
	}

	public BigDecimal getCl() {
		return this.cl;
	}

	public void setCl(BigDecimal cl) {
		this.cl = cl;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getCuDiss() {
		return this.cuDiss;
	}

	public void setCuDiss(BigDecimal cuDiss) {
		this.cuDiss = cuDiss;
	}

	public BigDecimal getCuTot() {
		return this.cuTot;
	}

	public void setCuTot(BigDecimal cuTot) {
		this.cuTot = cuTot;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getNh3N() {
		return this.nh3N;
	}

	public void setNh3N(BigDecimal nh3N) {
		this.nh3N = nh3N;
	}

	public BigDecimal getNo2N() {
		return this.no2N;
	}

	public void setNo2N(BigDecimal no2N) {
		this.no2N = no2N;
	}

	public BigDecimal getNo3N() {
		return this.no3N;
	}

	public void setNo3N(BigDecimal no3N) {
		this.no3N = no3N;
	}

	public BigDecimal getPo4P() {
		return this.po4P;
	}

	public void setPo4P(BigDecimal po4P) {
		this.po4P = po4P;
	}

	public BigDecimal getSampleDepth() {
		return this.sampleDepth;
	}

	public void setSampleDepth(BigDecimal sampleDepth) {
		this.sampleDepth = sampleDepth;
	}

	public String getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo) {
		this.sampleNo = sampleNo;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public BigDecimal getSi() {
		return this.si;
	}

	public void setSi(BigDecimal si) {
		this.si = si;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getStationId() {
		return this.stationId;
	}

	public void setStationId(BigDecimal stationId) {
		this.stationId = stationId;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
	}

	public BigDecimal getTn() {
		return this.tn;
	}

	public void setTn(BigDecimal tn) {
		this.tn = tn;
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

}