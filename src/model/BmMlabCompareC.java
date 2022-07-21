package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_mlab_compare_c database table.
 * 
 */
//@Entity
@Table(name="bm_mlab_compare_c")
@NamedQuery(name="BmMlabCompareC.findAll", query="SELECT b FROM BmMlabCompareC b")
public class BmMlabCompareC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	private String bmvisit;

	@Column(name="cl_ec")
	private BigDecimal clEc;

	@Column(name="cl_entrc")
	private BigDecimal clEntrc;

	@Column(name="cl_est_ec")
	private String clEstEc;

	@Column(name="cl_est_entrc")
	private String clEstEntrc;

	@Column(name="cl_l_ec")
	private String clLEc;

	@Column(name="cl_l_entrc")
	private String clLEntrc;

	private String closed;

	@Column(name="district_name")
	private String districtName;

	@Column(name="district_order")
	private String districtOrder;

	@Column(name="list_order")
	private String listOrder;

	@Column(name="location_code")
	private String locationCode;

	@Column(name="mlab_ec")
	private BigDecimal mlabEc;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	public BmMlabCompareC() {
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

	public String getBeachName() {
		return this.beachName;
	}

	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}

	public String getBmvisit() {
		return this.bmvisit;
	}

	public void setBmvisit(String bmvisit) {
		this.bmvisit = bmvisit;
	}

	public BigDecimal getClEc() {
		return this.clEc;
	}

	public void setClEc(BigDecimal clEc) {
		this.clEc = clEc;
	}

	public BigDecimal getClEntrc() {
		return this.clEntrc;
	}

	public void setClEntrc(BigDecimal clEntrc) {
		this.clEntrc = clEntrc;
	}

	public String getClEstEc() {
		return this.clEstEc;
	}

	public void setClEstEc(String clEstEc) {
		this.clEstEc = clEstEc;
	}

	public String getClEstEntrc() {
		return this.clEstEntrc;
	}

	public void setClEstEntrc(String clEstEntrc) {
		this.clEstEntrc = clEstEntrc;
	}

	public String getClLEc() {
		return this.clLEc;
	}

	public void setClLEc(String clLEc) {
		this.clLEc = clLEc;
	}

	public String getClLEntrc() {
		return this.clLEntrc;
	}

	public void setClLEntrc(String clLEntrc) {
		this.clLEntrc = clLEntrc;
	}

	public String getClosed() {
		return this.closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictOrder() {
		return this.districtOrder;
	}

	public void setDistrictOrder(String districtOrder) {
		this.districtOrder = districtOrder;
	}

	public String getListOrder() {
		return this.listOrder;
	}

	public void setListOrder(String listOrder) {
		this.listOrder = listOrder;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public BigDecimal getMlabEc() {
		return this.mlabEc;
	}

	public void setMlabEc(BigDecimal mlabEc) {
		this.mlabEc = mlabEc;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
	}

}