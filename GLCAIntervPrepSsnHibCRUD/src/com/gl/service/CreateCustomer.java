package com.gl.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;



public class CreateCustomer {

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
					System.out.println("Creating new Customer object...");
					Customer customer1 = new Customer("Mahesh Kumar", "Malleswaram", "9829939939","mahi@gl.com");
					Customer customer2 = new Customer("Rajesh Kumar", "Indiranagar", "9829945939","raj@gl.com");
					Customer customer3 = new Customer("Kiran Kumar Rathod", "Vijayanagar", "9845639939","kiran@gmail.com");
					Customer customer4 = new Customer("Manoj Kumar Rathod", "Jayanagar", "9829946219","manoj@gmail.com");
					Customer customer5 = new Customer("Ratan Kumar", "Jayanagar", "9829942319","ratan@gmail.com");
					
					//start a transaction
					session.beginTransaction();
					
					//save the student object
					System.out.println("saving the Customer Records ..."); 
					session.save(customer1);
					session.save(customer2);
					session.save(customer3);
					session.save(customer4);
					session.save(customer5);
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Insertion of Customer Records Done Succeessfully..");
				}
				finally {
					factory.close();
					session.close();
				}

	}

}
