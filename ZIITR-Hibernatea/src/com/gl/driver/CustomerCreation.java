package com.gl.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;

public class CustomerCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
									.configure("hibernate1.cfg1.xml")
									.addAnnotatedClass(Customer.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		Customer customer = new Customer("Harsha","Indiranagar");
		try
		{
			Transaction tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
			System.out.println("Inserted Customer Record successfully...");
		}
		finally
		{
			session.close();
			factory.close();
		}
	}

}
