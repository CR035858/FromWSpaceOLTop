package com.gl.driver;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;

public class CreateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sFactory = new Configuration()
									.configure("hibernate1.cfg1.xml")
									.addAnnotatedClass(Customer.class)
									.buildSessionFactory();
		
		Session session = sFactory.getCurrentSession();
		
		System.out.println("Connection Established...");
		
		try
		{
			Customer customer = new Customer("Harish Kumar","Indiranagar","7383383883","harish@gmail.com");
			org.hibernate.Transaction tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
			System.out.println("Record Saved "+customer);
			
		}
		finally
		{
			session.close();
		}
		
		
		

	}

}
