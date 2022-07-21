package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_sediment_pcb1 database table.
 * 
 */
//@Entity
@Table(name="toxic_sediment_pcb1")
@NamedQuery(name="ToxicSedimentPcb1.findAll", query="SELECT t FROM ToxicSedimentPcb1 t")
public class ToxicSedimentPcb1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_pcb101")
	private String lPcb101;

	@Column(name="l_pcb105")
	private String lPcb105;

	@Column(name="l_pcb114")
	private String lPcb114;

	@Column(name="l_pcb118")
	private String lPcb118;

	@Column(name="l_pcb123")
	private String lPcb123;

	@Column(name="l_pcb126")
	private String lPcb126;

	@Column(name="l_pcb128")
	private String lPcb128;

	@Column(name="l_pcb138")
	private String lPcb138;

	@Column(name="l_pcb149")
	private String lPcb149;

	@Column(name="l_pcb153")
	private String lPcb153;

	@Column(name="l_pcb156")
	private String lPcb156;

	@Column(name="l_pcb157")
	private String lPcb157;

	@Column(name="l_pcb167")
	private String lPcb167;

	@Column(name="l_pcb169")
	private String lPcb169;

	@Column(name="l_pcb170")
	private String lPcb170;

	@Column(name="l_pcb18")
	private String lPcb18;

	@Column(name="l_pcb180")
	private String lPcb180;

	@Column(name="l_pcb187")
	private String lPcb187;

	@Column(name="l_pcb189")
	private String lPcb189;

	@Column(name="l_pcb28")
	private String lPcb28;

	@Column(name="l_pcb31")
	private String lPcb31;

	@Column(name="l_pcb44")
	private String lPcb44;

	@Column(name="l_pcb52")
	private String lPcb52;

	@Column(name="l_pcb66")
	private String lPcb66;

	@Column(name="l_pcb77")
	private String lPcb77;

	@Column(name="l_pcb8")
	private String lPcb8;

	@Column(name="l_pcb81")
	private String lPcb81;

	private Timestamp mdate;

	private BigDecimal pcb;

	private BigDecimal pcb101;

	private BigDecimal pcb105;

	private BigDecimal pcb114;

	private BigDecimal pcb118;

	private BigDecimal pcb123;

	private BigDecimal pcb126;

	private BigDecimal pcb128;

	private BigDecimal pcb138;

	private BigDecimal pcb149;

	private BigDecimal pcb153;

	private BigDecimal pcb156;

	private BigDecimal pcb157;

	private BigDecimal pcb167;

	private BigDecimal pcb169;

	private BigDecimal pcb170;

	private BigDecimal pcb18;

	private BigDecimal pcb180;

	private BigDecimal pcb187;

	private BigDecimal pcb189;

	private BigDecimal pcb28;

	private BigDecimal pcb31;

	private BigDecimal pcb44;

	private BigDecimal pcb52;

	private BigDecimal pcb66;

	private BigDecimal pcb77;

	private BigDecimal pcb8;

	private BigDecimal pcb81;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	@Column(name="tso_dwr")
	private BigDecimal tsoDwr;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public ToxicSedimentPcb1() {
	}

	public String getLPcb101() {
		return this.lPcb101;
	}

	public void setLPcb101(String lPcb101) {
		this.lPcb101 = lPcb101;
	}

	public String getLPcb105() {
		return this.lPcb105;
	}

	public void setLPcb105(String lPcb105) {
		this.lPcb105 = lPcb105;
	}

	public String getLPcb114() {
		return this.lPcb114;
	}

	public void setLPcb114(String lPcb114) {
		this.lPcb114 = lPcb114;
	}

	public String getLPcb118() {
		return this.lPcb118;
	}

	public void setLPcb118(String lPcb118) {
		this.lPcb118 = lPcb118;
	}

	public String getLPcb123() {
		return this.lPcb123;
	}

	public void setLPcb123(String lPcb123) {
		this.lPcb123 = lPcb123;
	}

	public String getLPcb126() {
		return this.lPcb126;
	}

	public void setLPcb126(String lPcb126) {
		this.lPcb126 = lPcb126;
	}

	public String getLPcb128() {
		return this.lPcb128;
	}

	public void setLPcb128(String lPcb128) {
		this.lPcb128 = lPcb128;
	}

	public String getLPcb138() {
		return this.lPcb138;
	}

	public void setLPcb138(String lPcb138) {
		this.lPcb138 = lPcb138;
	}

	public String getLPcb149() {
		return this.lPcb149;
	}

	public void setLPcb149(String lPcb149) {
		this.lPcb149 = lPcb149;
	}

	public String getLPcb153() {
		return this.lPcb153;
	}

	public void setLPcb153(String lPcb153) {
		this.lPcb153 = lPcb153;
	}

	public String getLPcb156() {
		return this.lPcb156;
	}

	public void setLPcb156(String lPcb156) {
		this.lPcb156 = lPcb156;
	}

	public String getLPcb157() {
		return this.lPcb157;
	}

	public void setLPcb157(String lPcb157) {
		this.lPcb157 = lPcb157;
	}

	public String getLPcb167() {
		return this.lPcb167;
	}

	public void setLPcb167(String lPcb167) {
		this.lPcb167 = lPcb167;
	}

	public String getLPcb169() {
		return this.lPcb169;
	}

	public void setLPcb169(String lPcb169) {
		this.lPcb169 = lPcb169;
	}

	public String getLPcb170() {
		return this.lPcb170;
	}

	public void setLPcb170(String lPcb170) {
		this.lPcb170 = lPcb170;
	}

	public String getLPcb18() {
		return this.lPcb18;
	}

	public void setLPcb18(String lPcb18) {
		this.lPcb18 = lPcb18;
	}

	public String getLPcb180() {
		return this.lPcb180;
	}

	public void setLPcb180(String lPcb180) {
		this.lPcb180 = lPcb180;
	}

	public String getLPcb187() {
		return this.lPcb187;
	}

	public void setLPcb187(String lPcb187) {
		this.lPcb187 = lPcb187;
	}

	public String getLPcb189() {
		return this.lPcb189;
	}

	public void setLPcb189(String lPcb189) {
		this.lPcb189 = lPcb189;
	}

	public String getLPcb28() {
		return this.lPcb28;
	}

	public void setLPcb28(String lPcb28) {
		this.lPcb28 = lPcb28;
	}

	public String getLPcb31() {
		return this.lPcb31;
	}

	public void setLPcb31(String lPcb31) {
		this.lPcb31 = lPcb31;
	}

	public String getLPcb44() {
		return this.lPcb44;
	}

	public void setLPcb44(String lPcb44) {
		this.lPcb44 = lPcb44;
	}

	public String getLPcb52() {
		return this.lPcb52;
	}

	public void setLPcb52(String lPcb52) {
		this.lPcb52 = lPcb52;
	}

	public String getLPcb66() {
		return this.lPcb66;
	}

	public void setLPcb66(String lPcb66) {
		this.lPcb66 = lPcb66;
	}

	public String getLPcb77() {
		return this.lPcb77;
	}

	public void setLPcb77(String lPcb77) {
		this.lPcb77 = lPcb77;
	}

	public String getLPcb8() {
		return this.lPcb8;
	}

	public void setLPcb8(String lPcb8) {
		this.lPcb8 = lPcb8;
	}

	public String getLPcb81() {
		return this.lPcb81;
	}

	public void setLPcb81(String lPcb81) {
		this.lPcb81 = lPcb81;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPcb() {
		return this.pcb;
	}

	public void setPcb(BigDecimal pcb) {
		this.pcb = pcb;
	}

	public BigDecimal getPcb101() {
		return this.pcb101;
	}

	public void setPcb101(BigDecimal pcb101) {
		this.pcb101 = pcb101;
	}

	public BigDecimal getPcb105() {
		return this.pcb105;
	}

	public void setPcb105(BigDecimal pcb105) {
		this.pcb105 = pcb105;
	}

	public BigDecimal getPcb114() {
		return this.pcb114;
	}

	public void setPcb114(BigDecimal pcb114) {
		this.pcb114 = pcb114;
	}

	public BigDecimal getPcb118() {
		return this.pcb118;
	}

	public void setPcb118(BigDecimal pcb118) {
		this.pcb118 = pcb118;
	}

	public BigDecimal getPcb123() {
		return this.pcb123;
	}

	public void setPcb123(BigDecimal pcb123) {
		this.pcb123 = pcb123;
	}

	public BigDecimal getPcb126() {
		return this.pcb126;
	}

	public void setPcb126(BigDecimal pcb126) {
		this.pcb126 = pcb126;
	}

	public BigDecimal getPcb128() {
		return this.pcb128;
	}

	public void setPcb128(BigDecimal pcb128) {
		this.pcb128 = pcb128;
	}

	public BigDecimal getPcb138() {
		return this.pcb138;
	}

	public void setPcb138(BigDecimal pcb138) {
		this.pcb138 = pcb138;
	}

	public BigDecimal getPcb149() {
		return this.pcb149;
	}

	public void setPcb149(BigDecimal pcb149) {
		this.pcb149 = pcb149;
	}

	public BigDecimal getPcb153() {
		return this.pcb153;
	}

	public void setPcb153(BigDecimal pcb153) {
		this.pcb153 = pcb153;
	}

	public BigDecimal getPcb156() {
		return this.pcb156;
	}

	public void setPcb156(BigDecimal pcb156) {
		this.pcb156 = pcb156;
	}

	public BigDecimal getPcb157() {
		return this.pcb157;
	}

	public void setPcb157(BigDecimal pcb157) {
		this.pcb157 = pcb157;
	}

	public BigDecimal getPcb167() {
		return this.pcb167;
	}

	public void setPcb167(BigDecimal pcb167) {
		this.pcb167 = pcb167;
	}

	public BigDecimal getPcb169() {
		return this.pcb169;
	}

	public void setPcb169(BigDecimal pcb169) {
		this.pcb169 = pcb169;
	}

	public BigDecimal getPcb170() {
		return this.pcb170;
	}

	public void setPcb170(BigDecimal pcb170) {
		this.pcb170 = pcb170;
	}

	public BigDecimal getPcb18() {
		return this.pcb18;
	}

	public void setPcb18(BigDecimal pcb18) {
		this.pcb18 = pcb18;
	}

	public BigDecimal getPcb180() {
		return this.pcb180;
	}

	public void setPcb180(BigDecimal pcb180) {
		this.pcb180 = pcb180;
	}

	public BigDecimal getPcb187() {
		return this.pcb187;
	}

	public void setPcb187(BigDecimal pcb187) {
		this.pcb187 = pcb187;
	}

	public BigDecimal getPcb189() {
		return this.pcb189;
	}

	public void setPcb189(BigDecimal pcb189) {
		this.pcb189 = pcb189;
	}

	public BigDecimal getPcb28() {
		return this.pcb28;
	}

	public void setPcb28(BigDecimal pcb28) {
		this.pcb28 = pcb28;
	}

	public BigDecimal getPcb31() {
		return this.pcb31;
	}

	public void setPcb31(BigDecimal pcb31) {
		this.pcb31 = pcb31;
	}

	public BigDecimal getPcb44() {
		return this.pcb44;
	}

	public void setPcb44(BigDecimal pcb44) {
		this.pcb44 = pcb44;
	}

	public BigDecimal getPcb52() {
		return this.pcb52;
	}

	public void setPcb52(BigDecimal pcb52) {
		this.pcb52 = pcb52;
	}

	public BigDecimal getPcb66() {
		return this.pcb66;
	}

	public void setPcb66(BigDecimal pcb66) {
		this.pcb66 = pcb66;
	}

	public BigDecimal getPcb77() {
		return this.pcb77;
	}

	public void setPcb77(BigDecimal pcb77) {
		this.pcb77 = pcb77;
	}

	public BigDecimal getPcb8() {
		return this.pcb8;
	}

	public void setPcb8(BigDecimal pcb8) {
		this.pcb8 = pcb8;
	}

	public BigDecimal getPcb81() {
		return this.pcb81;
	}

	public void setPcb81(BigDecimal pcb81) {
		this.pcb81 = pcb81;
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

	public BigDecimal getTsoDwr() {
		return this.tsoDwr;
	}

	public void setTsoDwr(BigDecimal tsoDwr) {
		this.tsoDwr = tsoDwr;
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