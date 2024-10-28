package com.gl.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Employee;

public class EmployeeInserter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		Session session = factory.openSession();
		Employee employee;
		try
		{
			employee = new Employee("Kiran Kumar","Vijayanagar","9833993933","kiran@gmail.com");//Transient
			Transaction tx = session.beginTransaction();
			session.save(employee);//Persistent
			tx.commit();
			System.out.println("Inserted Employee Record Successfully");
			
		}
		finally
		{
			session.close();
			factory.close();
		}

	}

}
