package com.gl.shop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.shop.entity.Login;
import com.gl.shop.entity.Product;


@Repository
@EnableTransactionManagement
public class ProductsDao {
	

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	public ProductsDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	@Transactional
	public List <String> getCategories()
	{
		Transaction tx = session.beginTransaction();
		List <String> categories = session.createSQLQuery("select distinct Category from Product").list();
		tx.commit();
		return categories;
	}
	
	@Transactional
	public List <Product> getProductByCategory(String categoryS)
	{
		Transaction tx = session.beginTransaction();
		String hql = "from Product p where p.category = :categoryP";
		List <Product> products = session.createQuery(hql)
									.setParameter("categoryP", categoryS)
									.list();
		tx.commit();
		return products;
	}
	
	@Transactional
	public Product getProductById(int productId)
	{
		Transaction tx = session.beginTransaction();
		Product product = session.get(Product.class, productId);
		tx.commit();
		return product;
	}

	
}
