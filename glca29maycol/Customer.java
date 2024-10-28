package com.gl.glca29maycol;

public class Customer {
	
	String custId;
	String custName;
	String custCity;
	int purchaseValue;
	
	
	public Customer() {
		super();
	}


	public Customer(String custId, String custName, String custCity, int purchaseValue) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custCity = custCity;
		this.purchaseValue = purchaseValue;
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


	public String getCustCity() {
		return custCity;
	}


	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}


	public int getPurchaseValue() {
		return purchaseValue;
	}


	public void setPurchaseValue(int purchaseValue) {
		this.purchaseValue = purchaseValue;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custCity=" + custCity + ", purchaseValue="
				+ purchaseValue + "]";
	}
	
	

}
