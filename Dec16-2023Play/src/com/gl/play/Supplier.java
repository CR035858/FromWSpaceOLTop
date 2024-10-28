package com.gl.play;

import java.util.Comparator;

public class Supplier implements Comparator<Supplier>{

public	String supplierId;
public	String supplierName;
public	String supplierAddress;
public	int supplyValue;
	
	
	public Supplier() {
		super();
	}


	public Supplier(String supplierId, String supplierName, String supplierAddress, int supplyValue) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.supplyValue = supplyValue;
	}


	public String getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getSupplierAddress() {
		return supplierAddress;
	}


	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}


	public int getSupplyValue() {
		return supplyValue;
	}


	public void setSupplyValue(int supplyValue) {
		this.supplyValue = supplyValue;
	}


	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", supplyValue=" + supplyValue + "]";
	}


	@Override
	public int compare(Supplier o1, Supplier o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
