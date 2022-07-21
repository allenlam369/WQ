package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bm_flow_lst database table.
 * 
 */
//@Entity
@Table(name="bm_flow_lst")
@NamedQuery(name="BmFlowLst.findAll", query="SELECT b FROM BmFlowLst b")
public class BmFlowLst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="flow_f1")
	private String flowF1;

	@Column(name="flow_f2")
	private String flowF2;

	@Column(name="flow_f3")
	private String flowF3;

	@Column(name="flow_f4")
	private String flowF4;

	@Column(name="flow_f5")
	private String flowF5;

	@Column(name="flow_s1")
	private String flowS1;

	@Column(name="flow_s2")
	private String flowS2;

	@Column(name="flow_s3")
	private String flowS3;

	@Column(name="flow_s4")
	private String flowS4;

	@Column(name="flow_s5")
	private String flowS5;

	public BmFlowLst() {
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public String getFlowF1() {
		return this.flowF1;
	}

	public void setFlowF1(String flowF1) {
		this.flowF1 = flowF1;
	}

	public String getFlowF2() {
		return this.flowF2;
	}

	public void setFlowF2(String flowF2) {
		this.flowF2 = flowF2;
	}

	public String getFlowF3() {
		return this.flowF3;
	}

	public void setFlowF3(String flowF3) {
		this.flowF3 = flowF3;
	}

	public String getFlowF4() {
		return this.flowF4;
	}

	public void setFlowF4(String flowF4) {
		this.flowF4 = flowF4;
	}

	public String getFlowF5() {
		return this.flowF5;
	}

	public void setFlowF5(String flowF5) {
		this.flowF5 = flowF5;
	}

	public String getFlowS1() {
		return this.flowS1;
	}

	public void setFlowS1(String flowS1) {
		this.flowS1 = flowS1;
	}

	public String getFlowS2() {
		return this.flowS2;
	}

	public void setFlowS2(String flowS2) {
		this.flowS2 = flowS2;
	}

	public String getFlowS3() {
		return this.flowS3;
	}

	public void setFlowS3(String flowS3) {
		this.flowS3 = flowS3;
	}

	public String getFlowS4() {
		return this.flowS4;
	}

	public void setFlowS4(String flowS4) {
		this.flowS4 = flowS4;
	}

	public String getFlowS5() {
		return this.flowS5;
	}

	public void setFlowS5(String flowS5) {
		this.flowS5 = flowS5;
	}

}