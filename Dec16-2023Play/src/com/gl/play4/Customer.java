package com.gl.play4;

public class Customer {

	String custId;
	String custName;
	
	public Customer() {
		super();
	}

	public Customer(String custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	
}
