package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_check_dry_sf_view database table.
 * 
 */
//@Entity
@Table(name="bm_check_dry_sf_view")
@NamedQuery(name="BmCheckDrySfView.findAll", query="SELECT b FROM BmCheckDrySfView b")
public class BmCheckDrySfView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	private String date;

	@Column(name="ec_f1")
	private BigDecimal ecF1;

	@Column(name="ec_f2")
	private BigDecimal ecF2;

	@Column(name="ec_f3")
	private BigDecimal ecF3;

	@Column(name="ec_f4")
	private BigDecimal ecF4;

	@Column(name="ec_f5")
	private BigDecimal ecF5;

	@Column(name="ec_s1")
	private BigDecimal ecS1;

	@Column(name="ec_s2")
	private BigDecimal ecS2;

	@Column(name="ec_s3")
	private BigDecimal ecS3;

	@Column(name="ec_s4")
	private BigDecimal ecS4;

	@Column(name="ec_s5")
	private BigDecimal ecS5;

	@Column(name="flow_label_f1")
	private String flowLabelF1;

	@Column(name="flow_label_f2")
	private String flowLabelF2;

	@Column(name="flow_label_f3")
	private String flowLabelF3;

	@Column(name="flow_label_f4")
	private String flowLabelF4;

	@Column(name="flow_label_f5")
	private String flowLabelF5;

	@Column(name="flow_label_s1")
	private String flowLabelS1;

	@Column(name="flow_label_s2")
	private String flowLabelS2;

	@Column(name="flow_label_s3")
	private String flowLabelS3;

	@Column(name="flow_label_s4")
	private String flowLabelS4;

	@Column(name="flow_label_s5")
	private String flowLabelS5;

	public BmCheckDrySfView() {
	}

	public String getBeachName() {
		return this.beachName;
	}

	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BigDecimal getEcF1() {
		return this.ecF1;
	}

	public void setEcF1(BigDecimal ecF1) {
		this.ecF1 = ecF1;
	}

	public BigDecimal getEcF2() {
		return this.ecF2;
	}

	public void setEcF2(BigDecimal ecF2) {
		this.ecF2 = ecF2;
	}

	public BigDecimal getEcF3() {
		return this.ecF3;
	}

	public void setEcF3(BigDecimal ecF3) {
		this.ecF3 = ecF3;
	}

	public BigDecimal getEcF4() {
		return this.ecF4;
	}

	public void setEcF4(BigDecimal ecF4) {
		this.ecF4 = ecF4;
	}

	public BigDecimal getEcF5() {
		return this.ecF5;
	}

	public void setEcF5(BigDecimal ecF5) {
		this.ecF5 = ecF5;
	}

	public BigDecimal getEcS1() {
		return this.ecS1;
	}

	public void setEcS1(BigDecimal ecS1) {
		this.ecS1 = ecS1;
	}

	public BigDecimal getEcS2() {
		return this.ecS2;
	}

	public void setEcS2(BigDecimal ecS2) {
		this.ecS2 = ecS2;
	}

	public BigDecimal getEcS3() {
		return this.ecS3;
	}

	public void setEcS3(BigDecimal ecS3) {
		this.ecS3 = ecS3;
	}

	public BigDecimal getEcS4() {
		return this.ecS4;
	}

	public void setEcS4(BigDecimal ecS4) {
		this.ecS4 = ecS4;
	}

	public BigDecimal getEcS5() {
		return this.ecS5;
	}

	public void setEcS5(BigDecimal ecS5) {
		this.ecS5 = ecS5;
	}

	public String getFlowLabelF1() {
		return this.flowLabelF1;
	}

	public void setFlowLabelF1(String flowLabelF1) {
		this.flowLabelF1 = flowLabelF1;
	}

	public String getFlowLabelF2() {
		return this.flowLabelF2;
	}

	public void setFlowLabelF2(String flowLabelF2) {
		this.flowLabelF2 = flowLabelF2;
	}

	public String getFlowLabelF3() {
		return this.flowLabelF3;
	}

	public void setFlowLabelF3(String flowLabelF3) {
		this.flowLabelF3 = flowLabelF3;
	}

	public String getFlowLabelF4() {
		return this.flowLabelF4;
	}

	public void setFlowLabelF4(String flowLabelF4) {
		this.flowLabelF4 = flowLabelF4;
	}

	public String getFlowLabelF5() {
		return this.flowLabelF5;
	}

	public void setFlowLabelF5(String flowLabelF5) {
		this.flowLabelF5 = flowLabelF5;
	}

	public String getFlowLabelS1() {
		return this.flowLabelS1;
	}

	public void setFlowLabelS1(String flowLabelS1) {
		this.flowLabelS1 = flowLabelS1;
	}

	public String getFlowLabelS2() {
		return this.flowLabelS2;
	}

	public void setFlowLabelS2(String flowLabelS2) {
		this.flowLabelS2 = flowLabelS2;
	}

	public String getFlowLabelS3() {
		return this.flowLabelS3;
	}

	public void setFlowLabelS3(String flowLabelS3) {
		this.flowLabelS3 = flowLabelS3;
	}

	public String getFlowLabelS4() {
		return this.flowLabelS4;
	}

	public void setFlowLabelS4(String flowLabelS4) {
		this.flowLabelS4 = flowLabelS4;
	}

	public String getFlowLabelS5() {
		return this.flowLabelS5;
	}

	public void setFlowLabelS5(String flowLabelS5) {
		this.flowLabelS5 = flowLabelS5;
	}

}