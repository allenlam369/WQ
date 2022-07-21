package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the login_info database table.
 * 
 */
//@Entity
@Table(name="login_info")
@NamedQuery(name="LoginInfo.findAll", query="SELECT l FROM LoginInfo l")
public class LoginInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String application;

	@Column(name="login_name")
	private String loginName;

	@Column(name="login_time")
	private Timestamp loginTime;

	public LoginInfo() {
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

}