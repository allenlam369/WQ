package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_flow_sum1 database table.
 * 
 */
//@Entity
@Table(name="river_water_flow_sum1")
@NamedQuery(name="RiverWaterFlowSum1.findAll", query="SELECT r FROM RiverWaterFlowSum1 r")
public class RiverWaterFlowSum1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal depth;

	private BigDecimal flow;

	private Timestamp mdate;

	private String river;

	@Column(name="sample_no")
	private Integer sampleNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal vel;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private BigDecimal width;

	private String zone;

	public RiverWaterFlowSum1() {
	}

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}

	public BigDecimal getFlow() {
		return this.flow;
	}

	public void setFlow(BigDecimal flow) {
		this.flow = flow;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public Integer getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(Integer sampleNo) {
		this.sampleNo = sampleNo;
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

	public BigDecimal getVel() {
		return this.vel;
	}

	public void setVel(BigDecimal vel) {
		this.vel = vel;
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

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}