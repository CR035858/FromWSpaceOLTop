package com.gl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeId")
	int id;
	
	@Column(name="employeeName")
	String employeeName;
	
	@Column(name="employeeAddress")
	String employeeAddress;
	
	@Column(name="employeePhone")
	String employeePhone;
	
	@Column(name="employeeMail")
	String employeeMail;

	public Employee() {
		super();
	}

	public Employee(int id, String employeeName, String employeeAddress, String employeePhone, String employeeMail) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.employeeMail = employeeMail;
	}

	public Employee(String employeeName, String employeeAddress, String employeePhone, String employeeMail) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.employeeMail = employeeMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeMail() {
		return employeeMail;
	}

	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress
				+ ", employeePhone=" + employeePhone + ", employeeMail=" + employeeMail + "]";
	}
	
	
	

}
