package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_mw_quality_add database table.
 * 
 */
//@Entity
@Table(name="db_mw_quality_add")
@NamedQuery(name="DbMwQualityAdd.findAll", query="SELECT d FROM DbMwQualityAdd d")
public class DbMwQualityAdd implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal alkalinity;

	private BigDecimal bicarbonate;

	private BigDecimal carbonate;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="fe_diss")
	private BigDecimal feDiss;

	@Column(name="fe_sus")
	private BigDecimal feSus;

	@Column(name="fe_tot")
	private BigDecimal feTot;

	private Timestamp mdate;

	@Column(name="qu_carbonate")
	private String quCarbonate;

	@Column(name="qu_fe_diss")
	private String quFeDiss;

	@Column(name="qu_fe_sus")
	private String quFeSus;

	@Column(name="qu_fe_tot")
	private String quFeTot;

	@Column(name="qu_toc_sus")
	private String quTocSus;

	@Column(name="s_tot")
	private BigDecimal sTot;

	@Column(name="sample_depth")
	private BigDecimal sampleDepth;

	@Column(name="sample_no")
	private String sampleNo;

	private String scode;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	private BigDecimal toc;

	@Column(name="toc_diss")
	private BigDecimal tocDiss;

	@Column(name="toc_sus")
	private BigDecimal tocSus;

	public DbMwQualityAdd() {
	}

	public BigDecimal getAlkalinity() {
		return this.alkalinity;
	}

	public void setAlkalinity(BigDecimal alkalinity) {
		this.alkalinity = alkalinity;
	}

	public BigDecimal getBicarbonate() {
		return this.bicarbonate;
	}

	public void setBicarbonate(BigDecimal bicarbonate) {
		this.bicarbonate = bicarbonate;
	}

	public BigDecimal getCarbonate() {
		return this.carbonate;
	}

	public void setCarbonate(BigDecimal carbonate) {
		this.carbonate = carbonate;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public BigDecimal getFeDiss() {
		return this.feDiss;
	}

	public void setFeDiss(BigDecimal feDiss) {
		this.feDiss = feDiss;
	}

	public BigDecimal getFeSus() {
		return this.feSus;
	}

	public void setFeSus(BigDecimal feSus) {
		this.feSus = feSus;
	}

	public BigDecimal getFeTot() {
		return this.feTot;
	}

	public void setFeTot(BigDecimal feTot) {
		this.feTot = feTot;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getQuCarbonate() {
		return this.quCarbonate;
	}

	public void setQuCarbonate(String quCarbonate) {
		this.quCarbonate = quCarbonate;
	}

	public String getQuFeDiss() {
		return this.quFeDiss;
	}

	public void setQuFeDiss(String quFeDiss) {
		this.quFeDiss = quFeDiss;
	}

	public String getQuFeSus() {
		return this.quFeSus;
	}

	public void setQuFeSus(String quFeSus) {
		this.quFeSus = quFeSus;
	}

	public String getQuFeTot() {
		return this.quFeTot;
	}

	public void setQuFeTot(String quFeTot) {
		this.quFeTot = quFeTot;
	}

	public String getQuTocSus() {
		return this.quTocSus;
	}

	public void setQuTocSus(String quTocSus) {
		this.quTocSus = quTocSus;
	}

	public BigDecimal getSTot() {
		return this.sTot;
	}

	public void setSTot(BigDecimal sTot) {
		this.sTot = sTot;
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

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public BigDecimal getTocDiss() {
		return this.tocDiss;
	}

	public void setTocDiss(BigDecimal tocDiss) {
		this.tocDiss = tocDiss;
	}

	public BigDecimal getTocSus() {
		return this.tocSus;
	}

	public void setTocSus(BigDecimal tocSus) {
		this.tocSus = tocSus;
	}

}