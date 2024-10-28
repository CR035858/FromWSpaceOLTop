package com.gl.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="eMail")
	String eMail;
	
	@Column(name="address")
	String address;
	
	@Column(name="mobileNo")
	String mobileNo;
	
	@Column(name="occupation")
	String occupation;
	
	@Column(name="hobbies")
	String hobbies;
	
	@Column(name="country")
	String country;
	

	@Column(name="gender")
	String gender;
	
	@Column(name="loginId")
	String loginId;
	
	@Column(name="password")
	String password;
	
	@Column(name="role")
	String role;

	public Registration() {
		super();
	}


	public Registration(int id, String firstName, String lastName, String eMail, String address, String mobileNo,
			String occupation, String hobbies, String country, String gender, String loginId, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.address = address;
		this.mobileNo = mobileNo;
		this.occupation = occupation;
		this.hobbies = hobbies;
		this.country = country;
		this.gender = gender;
		this.loginId = loginId;
		this.password = password;
	}

	

	public Registration(String firstName, String lastName, String eMail, String address, String mobileNo,
			String occupation, String hobbies, String country, String gender, String loginId, String password,
			String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.address = address;
		this.mobileNo = mobileNo;
		this.occupation = occupation;
		this.hobbies = hobbies;
		this.country = country;
		this.gender = gender;
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
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

	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Registration [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail
				+ ", address=" + address + ", mobileNo=" + mobileNo + ", occupation=" + occupation + ", hobbies="
				+ hobbies + ", country=" + country + ", gender=" + gender + ", loginId=" + loginId + ", password="
				+ password + "]";
	}

	
	

}
