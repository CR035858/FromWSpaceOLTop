package com.gl.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Employee;

public class EmployeeRetriever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Employee employee ;
		try
		{
			int empId = 1;
			
			Transaction tx = session.beginTransaction();
				employee = session.get(Employee.class,empId);
			tx.commit();
			
			System.out.println("The Employee with Id "+empId);
			System.out.println(employee);
		}
		finally
		{
			session.close();
			factory.close();
		}
	}

}
