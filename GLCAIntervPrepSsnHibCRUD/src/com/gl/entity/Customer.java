package com.gl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	
	public Customer() {
		super();
	}
	
	
	public Customer(int customerId, String customerName, String customerAddress, String customerPhone,
			String customereMail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customereMail = customereMail;
	}
	
	public Customer(String customerName, String customerAddress, String customerPhone,
			String customereMail) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customereMail = customereMail;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int customerId;

	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "customerAddress")
	private String customerAddress;
	
	@Column(name = "customerPhone")
	private String customerPhone;
	
	@Column(name = "customereMail")
	private String customereMail;

	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getCustomerPhone() {
		return customerPhone;
	}


	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}


	public String getCustomereMail() {
		return customereMail;
	}


	public void setCustomereMail(String customereMail) {
		this.customereMail = customereMail;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerPhone=" + customerPhone + ", customereMail=" + customereMail + "]";
	}
	
	

}
