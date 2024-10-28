package com.glca.examq1.model.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.glca.examq1.model.Course;
import com.glca.examq1.model.Student;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Not Mandatory to implement this section
		
		SessionFactory sFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.addAnnotatedClass(Course.class)
										.buildSessionFactory();
		Session session = sFactory.openSession();

	}

}
