package com.gl.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;


public class ReadCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create session factory
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Customer.class)
				                     .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create a student object
			System.out.println("----Creating new Customer object...");
			Customer customer = new Customer("Sindhu Patel", "Indiranagar","9823456732","sindhu@gl.com");
		
			//start a transaction
			session.beginTransaction();
			
			//save the Customer object
			System.out.println("saving the Customer ..."); 
			session.save(customer);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Saving Customer Record is Done!");
			
			//find out the Customer's id
			System.out.println("saved Customer" + customer.getCustomerId());		
			
			//get a new session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on the id
			System.out.println("Getting Customer with id"+ customer.getCustomerId());
			//session.get(Customer.class,6)
			Customer customer1 = session.get(Customer.class, customer.getCustomerId());
			
			System.out.println(customer1);
			
			session.getTransaction().commit();
			
			System.out.println("Done ");
		}
		finally {
			factory.close();
		}

	}

}
