package com.gl.shop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.shop.entity.Registration;




@Repository
@EnableTransactionManagement
public class RegistrationDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	public RegistrationDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	@Transactional
	public List <Registration> getRegistrationsDao() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		List <Registration> registrations = session.createQuery("from Registration").list();
		tx.commit();
		return registrations;
	}

	
	@Transactional
	public Registration getRegistrationByIdDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Registration registration  = session.get(Registration.class, id);
		tx.commit();
		return registration;
	}


	@Transactional
	public void deleteRegistrationDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Registration registration  = session.get(Registration.class, id);
		session.delete(registration);
		tx.commit();
		
	}

	@Transactional
	public void saveRegistrationDao(Registration registration) {
		// TODO Auto-generated method stub
		System.out.println("Calling StudentRegn Save DAO");
		session = sessionFactory.openSession();
		session.saveOrUpdate(registration);
		
	
		/*
		 * 	session = sessionFactory.openSession();
		//	Transaction tx = session.beginTransaction();
			session.saveOrUpdate(studentDetail);
		//	tx.commit();
		// PLEASE NOTE WHEN SAVEORUPDATE METHOD IS USED 
		// IT DOES NOT NEED NEW TRANSACTION
		// AS WELL AS IF SAVEORUPDATE IS EXECUTED IN THE EXISTING SESSION
		//IT THROWS EXCEPTION SAYING THERE IS AN INSTANCE WITH THE ID ALREADY
			 */
		
		
	}

}
