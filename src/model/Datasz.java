package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the datasz database table.
 * 
 */
//@Entity
@NamedQuery(name="Datasz.findAll", query="SELECT d FROM Datasz d")
public class Datasz implements Serializable {
	private static final long serialVersionUID = 1L;

	private String f33;

	private String f34;

	private double ph值;

	private double 五日生化需氧量;

	private double 亚硝酸盐氮;

	private double 六价铬;

	private double 化学需氧量;

	private String 垂直位置;

	private double 总氮;

	private double 总硬度;

	private double 总磷;

	private double 悬浮物;

	private double 挥发酚;

	private double 氨氮;

	private String 氯化物;

	private double 氰化物;

	private String 水平位置;

	private double 水温;

	private double 汞;

	private String 河流名称;

	private double 溶解氧;

	private String 潮期;

	private double 电导率;

	private String 监测点位;

	private double 石油类;

	private double 砷;

	private double 硝酸盐氮;

	private double 硫化物;

	private Timestamp 采样日期;

	private double 铅;

	private double 铜;

	private double 镉;

	private double 非离子氨;

	private double 高锰酸盐指数;

	public Datasz() {
	}

	public String getF33() {
		return this.f33;
	}

	public void setF33(String f33) {
		this.f33 = f33;
	}

	public String getF34() {
		return this.f34;
	}

	public void setF34(String f34) {
		this.f34 = f34;
	}

	public double getPh值() {
		return this.ph值;
	}

	public void setPh值(double ph值) {
		this.ph值 = ph值;
	}

	public double get五日生化需氧量() {
		return this.五日生化需氧量;
	}

	public void set五日生化需氧量(double 五日生化需氧量) {
		this.五日生化需氧量 = 五日生化需氧量;
	}

	public double get亚硝酸盐氮() {
		return this.亚硝酸盐氮;
	}

	public void set亚硝酸盐氮(double 亚硝酸盐氮) {
		this.亚硝酸盐氮 = 亚硝酸盐氮;
	}

	public double get六价铬() {
		return this.六价铬;
	}

	public void set六价铬(double 六价铬) {
		this.六价铬 = 六价铬;
	}

	public double get化学需氧量() {
		return this.化学需氧量;
	}

	public void set化学需氧量(double 化学需氧量) {
		this.化学需氧量 = 化学需氧量;
	}

	public String get垂直位置() {
		return this.垂直位置;
	}

	public void set垂直位置(String 垂直位置) {
		this.垂直位置 = 垂直位置;
	}

	public double get总氮() {
		return this.总氮;
	}

	public void set总氮(double 总氮) {
		this.总氮 = 总氮;
	}

	public double get总硬度() {
		return this.总硬度;
	}

	public void set总硬度(double 总硬度) {
		this.总硬度 = 总硬度;
	}

	public double get总磷() {
		return this.总磷;
	}

	public void set总磷(double 总磷) {
		this.总磷 = 总磷;
	}

	public double get悬浮物() {
		return this.悬浮物;
	}

	public void set悬浮物(double 悬浮物) {
		this.悬浮物 = 悬浮物;
	}

	public double get挥发酚() {
		return this.挥发酚;
	}

	public void set挥发酚(double 挥发酚) {
		this.挥发酚 = 挥发酚;
	}

	public double get氨氮() {
		return this.氨氮;
	}

	public void set氨氮(double 氨氮) {
		this.氨氮 = 氨氮;
	}

	public String get氯化物() {
		return this.氯化物;
	}

	public void set氯化物(String 氯化物) {
		this.氯化物 = 氯化物;
	}

	public double get氰化物() {
		return this.氰化物;
	}

	public void set氰化物(double 氰化物) {
		this.氰化物 = 氰化物;
	}

	public String get水平位置() {
		return this.水平位置;
	}

	public void set水平位置(String 水平位置) {
		this.水平位置 = 水平位置;
	}

	public double get水温() {
		return this.水温;
	}

	public void set水温(double 水温) {
		this.水温 = 水温;
	}

	public double get汞() {
		return this.汞;
	}

	public void set汞(double 汞) {
		this.汞 = 汞;
	}

	public String get河流名称() {
		return this.河流名称;
	}

	public void set河流名称(String 河流名称) {
		this.河流名称 = 河流名称;
	}

	public double get溶解氧() {
		return this.溶解氧;
	}

	public void set溶解氧(double 溶解氧) {
		this.溶解氧 = 溶解氧;
	}

	public String get潮期() {
		return this.潮期;
	}

	public void set潮期(String 潮期) {
		this.潮期 = 潮期;
	}

	public double get电导率() {
		return this.电导率;
	}

	public void set电导率(double 电导率) {
		this.电导率 = 电导率;
	}

	public String get监测点位() {
		return this.监测点位;
	}

	public void set监测点位(String 监测点位) {
		this.监测点位 = 监测点位;
	}

	public double get石油类() {
		return this.石油类;
	}

	public void set石油类(double 石油类) {
		this.石油类 = 石油类;
	}

	public double get砷() {
		return this.砷;
	}

	public void set砷(double 砷) {
		this.砷 = 砷;
	}

	public double get硝酸盐氮() {
		return this.硝酸盐氮;
	}

	public void set硝酸盐氮(double 硝酸盐氮) {
		this.硝酸盐氮 = 硝酸盐氮;
	}

	public double get硫化物() {
		return this.硫化物;
	}

	public void set硫化物(double 硫化物) {
		this.硫化物 = 硫化物;
	}

	public Timestamp get采样日期() {
		return this.采样日期;
	}

	public void set采样日期(Timestamp 采样日期) {
		this.采样日期 = 采样日期;
	}

	public double get铅() {
		return this.铅;
	}

	public void set铅(double 铅) {
		this.铅 = 铅;
	}

	public double get铜() {
		return this.铜;
	}

	public void set铜(double 铜) {
		this.铜 = 铜;
	}

	public double get镉() {
		return this.镉;
	}

	public void set镉(double 镉) {
		this.镉 = 镉;
	}

	public double get非离子氨() {
		return this.非离子氨;
	}

	public void set非离子氨(double 非离子氨) {
		this.非离子氨 = 非离子氨;
	}

	public double get高锰酸盐指数() {
		return this.高锰酸盐指数;
	}

	public void set高锰酸盐指数(double 高锰酸盐指数) {
		this.高锰酸盐指数 = 高锰酸盐指数;
	}

}