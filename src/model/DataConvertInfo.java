package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the data_convert_info database table.
 * 
 */
//@Entity
@Table(name="data_convert_info")
@NamedQuery(name="DataConvertInfo.findAll", query="SELECT d FROM DataConvertInfo d")
public class DataConvertInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="column_name")
	private String columnName;

	private BigDecimal scale;

	@Column(name="sou_column_name")
	private String souColumnName;

	@Column(name="source_name")
	private String sourceName;

	private String unit;

	public DataConvertInfo() {
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public BigDecimal getScale() {
		return this.scale;
	}

	public void setScale(BigDecimal scale) {
		this.scale = scale;
	}

	public String getSouColumnName() {
		return this.souColumnName;
	}

	public void setSouColumnName(String souColumnName) {
		this.souColumnName = souColumnName;
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}