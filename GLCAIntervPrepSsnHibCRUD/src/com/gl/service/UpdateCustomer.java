package com.gl.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;


public class UpdateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
						.buildSessionFactory();

				// create session
				Session session = factory.getCurrentSession();

				try {

					int customerId = 3;

					// start a transaction
					session.beginTransaction();

					System.out.println("getting Customer with id :" + customerId);

					//fetching record where Customer id = 5
					Customer tempCustomer = session.get(Customer.class, customerId);

					//updating value using setters
					System.out.println("updating Customer --");
					tempCustomer.setCustomerName("Suman Kumar");
					
					//commit transaction
					session.getTransaction().commit();

					session = factory.getCurrentSession();
					session.beginTransaction();

					// update email for all Customers whose Address is Jayanagar
					System.out.println("update email for all Customers Residing @ Jayanagar");
					session.createQuery("update Customer set customereMail = 'admin007@gl.com' where customerAddress = 'Jayanagar'").executeUpdate();
					
					//commit transaction
					session.getTransaction().commit();

					System.out.println("Updation Done Successfully....");
				} finally {
					factory.close();
				}

	}

}
