package com.gl.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.shop.dao.ProductsDao;
import com.gl.shop.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductsDao productsDao;

	@Override
	public List<String> getCategoriesSvc() {
		// TODO Auto-generated method stub
		return productsDao.getCategories();
	}

	@Override
	public List<Product> getProductByCategory(String categoryS) {
		// TODO Auto-generated method stub
		return productsDao.getProductByCategory(categoryS);
	}
	
	@Override
	public Product getProductById(int productId)
	{
		return productsDao.getProductById(productId);
	}

}
