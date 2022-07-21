package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_ms_quality_add database table.
 * 
 */
//@Entity
@Table(name="db_ms_quality_add")
@NamedQuery(name="DbMsQualityAdd.findAll", query="SELECT d FROM DbMsQualityAdd d")
public class DbMsQualityAdd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="acid_v_sulphide")
	private BigDecimal acidVSulphide;

	@Column(name="cal_carbonate")
	private BigDecimal calCarbonate;

	private BigDecimal cod;

	private BigDecimal fe;

	private Timestamp mdate;

	private BigDecimal moisture;

	@Column(name="no2_no3")
	private BigDecimal no2No3;

	private BigDecimal ph;

	@Column(name="qu_acid")
	private String quAcid;

	@Column(name="qu_cal_carbonate")
	private String quCalCarbonate;

	@Column(name="qu_no2_no3")
	private String quNo2No3;

	private String scode;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	public DbMsQualityAdd() {
	}

	public BigDecimal getAcidVSulphide() {
		return this.acidVSulphide;
	}

	public void setAcidVSulphide(BigDecimal acidVSulphide) {
		this.acidVSulphide = acidVSulphide;
	}

	public BigDecimal getCalCarbonate() {
		return this.calCarbonate;
	}

	public void setCalCarbonate(BigDecimal calCarbonate) {
		this.calCarbonate = calCarbonate;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getFe() {
		return this.fe;
	}

	public void setFe(BigDecimal fe) {
		this.fe = fe;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getMoisture() {
		return this.moisture;
	}

	public void setMoisture(BigDecimal moisture) {
		this.moisture = moisture;
	}

	public BigDecimal getNo2No3() {
		return this.no2No3;
	}

	public void setNo2No3(BigDecimal no2No3) {
		this.no2No3 = no2No3;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getQuAcid() {
		return this.quAcid;
	}

	public void setQuAcid(String quAcid) {
		this.quAcid = quAcid;
	}

	public String getQuCalCarbonate() {
		return this.quCalCarbonate;
	}

	public void setQuCalCarbonate(String quCalCarbonate) {
		this.quCalCarbonate = quCalCarbonate;
	}

	public String getQuNo2No3() {
		return this.quNo2No3;
	}

	public void setQuNo2No3(String quNo2No3) {
		this.quNo2No3 = quNo2No3;
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

}