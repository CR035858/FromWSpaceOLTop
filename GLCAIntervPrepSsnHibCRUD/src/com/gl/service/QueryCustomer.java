package com.gl.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;



public class QueryCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create session factory
		SessionFactory factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Customer.class)
							.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// query Customers
			List <Customer> theCustomers = session.createQuery("from Customer").list();

			// display Customers
			System.out.println("---------Customers Details-------------");
			displayCustomers(theCustomers);
			
			
			// query Customers Residing @ Jayanagar
			System.out.println("-----------------the Customers Residing @ Jayanagar -----------");
			theCustomers = session.createQuery("from Customer cust where cust.customerAddress = 'Jayanagar' ").list();						
			displayCustomers(theCustomers);
			

			// query Customers ending with Rathod
			System.out.println("-----------------the Customers with Names ending with  Rathod-----------");
			theCustomers = session.createQuery("from Customer cust where cust.customerName like '% Rathod'").list();
			// display Customers
			displayCustomers(theCustomers);
			
			System.out.println("---------Customers with gl.com in their email --------");
			//query Customers where email like %gl.com
			theCustomers = session.createQuery("from Customer cust where cust.customereMail like '%gl.com'").list();
			displayCustomers(theCustomers);


			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	//display Customer method uses enhanced for loop
	private static void displayCustomers(List<Customer> theCustomers) {
		for (Customer tempCustomer : theCustomers) {
			System.out.println(tempCustomer);
		}
	}

}
