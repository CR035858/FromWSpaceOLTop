package com.gl.shop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customerId;
	
	String customerName;
	String customerPhone;
	String customerAddress;
	String customerMail;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="customer_Id")
	private List <OrderDetail> orders;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="customer_Id")
	private List <PaymentDetail> paymentDetails;
	

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String customerPhone, String customerAddress,
			String customerMail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.customerMail = customerMail;
		
	}

	public Customer(String customerName, String customerPhone, String customerAddress, String customerMail) {
		super();
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.customerMail = customerMail;
		
	}

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

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	public List<OrderDetail> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDetail> orders) {
		this.orders = orders;
	}

	
	public List<PaymentDetail> getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(List<PaymentDetail> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customerAddress=" + customerAddress + ", customerMail=" + customerMail + "]";
	}

	/* Convenience Methods */
	
	public void addOrderDetail(OrderDetail orderDetail) {
		if(orders==null) {
			orders =new ArrayList<>();
		}
		orders.add(orderDetail);
	}
	
	public void addPaymentDetail(PaymentDetail paymentDetail) {
		if(paymentDetails==null) {
			paymentDetails =new ArrayList<>();
		}
		paymentDetails.add(paymentDetail);
	}
	
	

}
