package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_beach_config database table.
 * 
 */
@Entity
@Table(name="bm_beach_config")
@NamedQuery(name="BmBeachConfig.findAll", query="SELECT b FROM BmBeachConfig b")
public class BmBeachConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	private String closed;

	@Column(name="district_order")
	private String districtOrder;

	@Column(name="freshwater_f1")
	private String freshwaterF1;

	@Column(name="freshwater_f2")
	private String freshwaterF2;

	@Column(name="freshwater_f3")
	private String freshwaterF3;

	@Column(name="freshwater_f4")
	private String freshwaterF4;

	@Column(name="freshwater_f5")
	private String freshwaterF5;

	@Column(name="grade_cat")
	private BigDecimal gradeCat;

	@Column(name="list_order")
	private String listOrder;

	@Column(name="list_order_2")
	private String listOrder2;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="source_s1")
	private String sourceS1;

	@Column(name="source_s2")
	private String sourceS2;

	@Column(name="source_s3")
	private String sourceS3;

	@Column(name="source_s4")
	private String sourceS4;

	@Column(name="source_s5")
	private String sourceS5;

	@Column(name="spoint_l")
	private String spointL;

	@Column(name="spoint_m")
	private String spointM;

	@Column(name="spoint_o")
	private String spointO;

	@Column(name="spoint_r")
	private String spointR;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="wq_order")
	private BigDecimal wqOrder;

	//bi-directional one-to-one association to BmBeach
	@OneToOne
	@JoinColumn(name="beach_code")
	private BmBeach bmBeach;

	public BmBeachConfig() {
	}

	public String getBeachCode() {
		return this.beachCode;
	}

	public void setBeachCode(String beachCode) {
		this.beachCode = beachCode;
	}

	public String getBeachGroup() {
		return this.beachGroup;
	}

	public void setBeachGroup(String beachGroup) {
		this.beachGroup = beachGroup;
	}

	public String getClosed() {
		return this.closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getDistrictOrder() {
		return this.districtOrder;
	}

	public void setDistrictOrder(String districtOrder) {
		this.districtOrder = districtOrder;
	}

	public String getFreshwaterF1() {
		return this.freshwaterF1;
	}

	public void setFreshwaterF1(String freshwaterF1) {
		this.freshwaterF1 = freshwaterF1;
	}

	public String getFreshwaterF2() {
		return this.freshwaterF2;
	}

	public void setFreshwaterF2(String freshwaterF2) {
		this.freshwaterF2 = freshwaterF2;
	}

	public String getFreshwaterF3() {
		return this.freshwaterF3;
	}

	public void setFreshwaterF3(String freshwaterF3) {
		this.freshwaterF3 = freshwaterF3;
	}

	public String getFreshwaterF4() {
		return this.freshwaterF4;
	}

	public void setFreshwaterF4(String freshwaterF4) {
		this.freshwaterF4 = freshwaterF4;
	}

	public String getFreshwaterF5() {
		return this.freshwaterF5;
	}

	public void setFreshwaterF5(String freshwaterF5) {
		this.freshwaterF5 = freshwaterF5;
	}

	public BigDecimal getGradeCat() {
		return this.gradeCat;
	}

	public void setGradeCat(BigDecimal gradeCat) {
		this.gradeCat = gradeCat;
	}

	public String getListOrder() {
		return this.listOrder;
	}

	public void setListOrder(String listOrder) {
		this.listOrder = listOrder;
	}

	public String getListOrder2() {
		return this.listOrder2;
	}

	public void setListOrder2(String listOrder2) {
		this.listOrder2 = listOrder2;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public String getSourceS1() {
		return this.sourceS1;
	}

	public void setSourceS1(String sourceS1) {
		this.sourceS1 = sourceS1;
	}

	public String getSourceS2() {
		return this.sourceS2;
	}

	public void setSourceS2(String sourceS2) {
		this.sourceS2 = sourceS2;
	}

	public String getSourceS3() {
		return this.sourceS3;
	}

	public void setSourceS3(String sourceS3) {
		this.sourceS3 = sourceS3;
	}

	public String getSourceS4() {
		return this.sourceS4;
	}

	public void setSourceS4(String sourceS4) {
		this.sourceS4 = sourceS4;
	}

	public String getSourceS5() {
		return this.sourceS5;
	}

	public void setSourceS5(String sourceS5) {
		this.sourceS5 = sourceS5;
	}

	public String getSpointL() {
		return this.spointL;
	}

	public void setSpointL(String spointL) {
		this.spointL = spointL;
	}

	public String getSpointM() {
		return this.spointM;
	}

	public void setSpointM(String spointM) {
		this.spointM = spointM;
	}

	public String getSpointO() {
		return this.spointO;
	}

	public void setSpointO(String spointO) {
		this.spointO = spointO;
	}

	public String getSpointR() {
		return this.spointR;
	}

	public void setSpointR(String spointR) {
		this.spointR = spointR;
	}

	public BigDecimal getValidCode() {
		return this.validCode;
	}

	public void setValidCode(BigDecimal validCode) {
		this.validCode = validCode;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getValidUser() {
		return this.validUser;
	}

	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

	public BigDecimal getWqOrder() {
		return this.wqOrder;
	}

	public void setWqOrder(BigDecimal wqOrder) {
		this.wqOrder = wqOrder;
	}

	public BmBeach getBmBeach() {
		return this.bmBeach;
	}

	public void setBmBeach(BmBeach bmBeach) {
		this.bmBeach = bmBeach;
	}

}