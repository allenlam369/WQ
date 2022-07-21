package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_flow_sum database table.
 * 
 */
//@Entity
@Table(name="rw_flow_sum")
@NamedQuery(name="RwFlowSum.findAll", query="SELECT r FROM RwFlowSum r")
public class RwFlowSum implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal depth;

	private BigDecimal flow;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	private BigDecimal vel;

	private BigDecimal width;

	public RwFlowSum() {
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

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public BigDecimal getVel() {
		return this.vel;
	}

	public void setVel(BigDecimal vel) {
		this.vel = vel;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

}