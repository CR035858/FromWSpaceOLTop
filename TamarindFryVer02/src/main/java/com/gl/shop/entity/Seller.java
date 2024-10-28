package com.gl.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sellerId;
	
	String sellerName;
	String sellerAddress;
	String sellerMail;
	String sellerPhone;
	
	
	public Seller() {
		super();
	}


	public Seller(int sellerId, String sellerName, String sellerAddress, String sellerMail, String sellerPhone) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerAddress = sellerAddress;
		this.sellerMail = sellerMail;
		this.sellerPhone = sellerPhone;
	}


	public int getSellerId() {
		return sellerId;
	}


	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getSellerAddress() {
		return sellerAddress;
	}


	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}


	public String getSellerMail() {
		return sellerMail;
	}


	public void setSellerMail(String sellerMail) {
		this.sellerMail = sellerMail;
	}


	public String getSellerPhone() {
		return sellerPhone;
	}


	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}


	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerAddress=" + sellerAddress
				+ ", sellerMail=" + sellerMail + ", sellerPhone=" + sellerPhone + "]";
	}
	
	

}
