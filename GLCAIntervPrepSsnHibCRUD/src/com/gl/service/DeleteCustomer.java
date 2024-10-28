package com.gl.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Customer;


public class DeleteCustomer {

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

					// fetching record where teacher id = 3
					Customer tempCustomer = session.get(Customer.class, customerId);

					// deleting record using session.delete method
					System.out.println("delete Customer --");
					session.delete(tempCustomer);

					// commit transaction
					session.getTransaction().commit();

					session = factory.getCurrentSession();
					session.beginTransaction();

					// delete Customer with id = 4 using createQuery
					System.out.println("delete Customer with id = 4");
					session.createQuery("delete from Customer where id = 4 ").executeUpdate();

					// commit transaction
					session.getTransaction().commit();

					System.out.println("Done!");
				} finally {
					factory.close();
				}
	}

}
