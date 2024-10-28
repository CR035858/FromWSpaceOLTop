package com.gl.shop.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.shop.dao.RegistrationDao;
import com.gl.shop.entity.Registration;



@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao registrationDao;

	@Override
	public List<Registration> getRegistrationDetails() {
		// TODO Auto-generated method stub
		return registrationDao.getRegistrationsDao();
	}

	@Override
	public Registration getRegistrationDetailById(int id) {
		// TODO Auto-generated method stub
		return registrationDao.getRegistrationByIdDao(id);
	}

	@Override
	public void saveRegistrationDetail(Registration studentRegn) {
		// TODO Auto-generated method stub
		System.out.println("Calling StudentRegn Save Service");
		registrationDao.saveRegistrationDao(studentRegn);
	}

	@Override
	public void deleteRegistrationDetailById(int id) {
		// TODO Auto-generated method stub
		registrationDao.deleteRegistrationDao(id);
	}

	
	
	
	
	
}
