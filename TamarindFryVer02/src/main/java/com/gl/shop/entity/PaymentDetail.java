package com.gl.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentDetail")
public class PaymentDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int paymentId;
	
	String bankName;
	String cardNumber;
	String cardType;
	String cVVNo;
	
	public PaymentDetail() {
		super();
	}

	public PaymentDetail(int paymentId, String bankName, String cardNumber, String cardType, String cVVNo) {
		super();
		this.paymentId = paymentId;
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cVVNo = cVVNo;
	}

	public PaymentDetail(String bankName, String cardNumber, String cardType, String cVVNo) {
		super();
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cVVNo = cVVNo;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getcVVNo() {
		return cVVNo;
	}

	public void setcVVNo(String cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public String toString() {
		return "PaymentDetail [paymentId=" + paymentId + ", bankName=" + bankName + ", cardNumber=" + cardNumber
				+ ", cardType=" + cardType + ", cVVNo=" + cVVNo + "]";
	}
	
	

}
