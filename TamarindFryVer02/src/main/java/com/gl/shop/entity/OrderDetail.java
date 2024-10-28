 package com.gl.shop.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name="OrderDetail")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int orderId;
	
	Date orderDate;
	int quantity;
	double orderValue;
	String orderStatus;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="product_id")
	private Product product;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="seller_id")
	private Seller seller;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pyt_detail_id")
	private PaymentDetail paymentDetail;
	
	

	public OrderDetail() {
		super();
	}

	public OrderDetail(int orderId, Date orderDate, int quantity, double orderValue, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.orderValue = orderValue;
		this.orderStatus = orderStatus;
	}

	public OrderDetail(Date orderDate, int quantity, double orderValue, String orderStatus) {
		super();
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.orderValue = orderValue;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	
	public PaymentDetail getPaymentDetail() {
		return paymentDetail;
	}

	public void setPaymentDetail(PaymentDetail paymentDetail) {
		this.paymentDetail = paymentDetail;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderId=" + orderId + ", orderDate=" + orderDate + ", quantity=" + quantity
				+ ", orderValue=" + orderValue + ", orderStatus=" + orderStatus + "]";
	}
	
	
	
}
