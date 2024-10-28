package com.gl.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;

public class RetrieveCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
									.configure("hibernate1.cfg1.xml")
									.addAnnotatedClass(Customer.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		Customer customer ;
		try
		{
			Transaction tx = session.beginTransaction();
			customer = session.get(Customer.class, 1);
			tx.commit();
		}
		finally
		{
			session.close();
		}
		System.out.println("The Customer with id 1 ");
		System.out.println(customer);

	}

}
