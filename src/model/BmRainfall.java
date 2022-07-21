package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_rainfall database table.
 * 
 */
@Entity
@Table(name="bm_rainfall")
@NamedQuery(name="BmRainfall.findAll", query="SELECT b FROM BmRainfall b")
public class BmRainfall implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BmRainfallPK id;

	private Timestamp date;

	private BigDecimal hour;

	private BigDecimal rainfall;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmRainfall() {
	}

	public BmRainfallPK getId() {
		return this.id;
	}

	public void setId(BmRainfallPK id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public BigDecimal getHour() {
		return this.hour;
	}

	public void setHour(BigDecimal hour) {
		this.hour = hour;
	}

	public BigDecimal getRainfall() {
		return this.rainfall;
	}

	public void setRainfall(BigDecimal rainfall) {
		this.rainfall = rainfall;
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

}