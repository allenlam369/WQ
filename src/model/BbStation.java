package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bb_station database table.
 * 
 */
@Entity
@Table(name="bb_station")
@NamedQuery(name="BbStation.findAll", query="SELECT b FROM BbStation b")
public class BbStation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="station_id")
	private String stationId;

	private String active;

	private BigDecimal easting;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private BigDecimal northing;

	@Column(name="station_name")
	private String stationName;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private String wcz;

	//bi-directional many-to-one association to BbBc
	@OneToMany(mappedBy="bbStation")
	private List<BbBc> bbBcS;

	//bi-directional many-to-one association to BbLb
	@OneToMany(mappedBy="bbStation")
	private List<BbLb> bbLbs;

	public BbStation() {
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public BigDecimal getEasting() {
		return this.easting;
	}

	public void setEasting(BigDecimal easting) {
		this.easting = easting;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getNorthing() {
		return this.northing;
	}

	public void setNorthing(BigDecimal northing) {
		this.northing = northing;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
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

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public List<BbBc> getBbBcS() {
		return this.bbBcS;
	}

	public void setBbBcS(List<BbBc> bbBcS) {
		this.bbBcS = bbBcS;
	}

	public BbBc addBbBc(BbBc bbBc) {
		getBbBcS().add(bbBc);
		bbBc.setBbStation(this);

		return bbBc;
	}

	public BbBc removeBbBc(BbBc bbBc) {
		getBbBcS().remove(bbBc);
		bbBc.setBbStation(null);

		return bbBc;
	}

	public List<BbLb> getBbLbs() {
		return this.bbLbs;
	}

	public void setBbLbs(List<BbLb> bbLbs) {
		this.bbLbs = bbLbs;
	}

	public BbLb addBbLb(BbLb bbLb) {
		getBbLbs().add(bbLb);
		bbLb.setBbStation(this);

		return bbLb;
	}

	public BbLb removeBbLb(BbLb bbLb) {
		getBbLbs().remove(bbLb);
		bbLb.setBbStation(null);

		return bbLb;
	}

}