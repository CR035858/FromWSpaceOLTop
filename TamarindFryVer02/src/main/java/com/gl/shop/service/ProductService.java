package com.gl.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.shop.entity.Product;

@Service
public interface ProductService {
	
	public List <String> getCategoriesSvc();
	public List <Product> getProductByCategory(String categoryS);
	public Product getProductById(int productId);
	

}
