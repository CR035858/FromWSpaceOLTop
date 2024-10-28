package com.gl.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.shop.entity.Registration;



@Service
public interface RegistrationService {

	public List <Registration> getRegistrationDetails();
	public Registration getRegistrationDetailById(int id);
	public void saveRegistrationDetail(Registration studentRegn);
	public void deleteRegistrationDetailById(int id);
	
}
