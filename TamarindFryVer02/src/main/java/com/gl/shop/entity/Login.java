package com.gl.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="loginId")
	String loginId;
	
	@Column(name="password")
	String password;
	
	@Column(name="mailId")
	String mailId;
	
	@Column(name="role")
	String role;

	public Login() {
		super();
	}

	public Login(int id, String loginId, String password, String mailId) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.mailId = mailId;
	}

	public Login(String loginId, String password, String mailId) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.mailId = mailId;
	}
	

	public Login(String loginId, String password, String mailId, String role) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.mailId = mailId;
		this.role = role;
	}

	public Login(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", loginId=" + loginId + ", password=" + password + ", mailId=" + mailId + ", role="
				+ role + "]";
	}

	
	
	

}
