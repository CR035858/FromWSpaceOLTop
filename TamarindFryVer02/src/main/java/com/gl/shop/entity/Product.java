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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	
	String productName;
	int pricePerUnit;
	String category;
	String imagePath;
	String features;
	
	@ManyToMany(fetch=FetchType.LAZY,
		    cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                      CascadeType.DETACH, CascadeType.REFRESH})
     @JoinTable(
		name="product_seller",
		joinColumns=@JoinColumn(name="seller_id"),
		inverseJoinColumns=@JoinColumn(name="product_id")
		)
	private List <Seller> sellers;
	
	
	

	public Product() {
		super();
	}

	public Product(int productId, String productName, int pricePerUnit, String category, String imagePath,
			String features) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.category = category;
		this.imagePath = imagePath;
		this.features = features;
	}

	public Product(String productName, int pricePerUnit, String category, String imagePath, String features) {
		super();
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.category = category;
		this.imagePath = imagePath;
		this.features = features;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public List<Seller> getSellers() {
		return sellers;
	}

	public void setSellers(List<Seller> sellers) {
		this.sellers = sellers;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", pricePerUnit=" + pricePerUnit
				+ ", category=" + category + ", imagePath=" + imagePath + ", features=" + features + "]";
	}

	/* Convenience Method */
	public void addSeller(Seller seller) {
		if(sellers == null) {
			sellers = new ArrayList<>();
		}
		sellers.add(seller);
	}
	

}
