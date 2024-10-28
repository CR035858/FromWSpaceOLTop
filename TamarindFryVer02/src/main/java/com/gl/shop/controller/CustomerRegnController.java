package com.gl.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.shop.entity.Login;
import com.gl.shop.entity.Registration;
import com.gl.shop.service.LoginService;
import com.gl.shop.service.RegistrationService;



@Controller
@RequestMapping("/customerRegn")
public class CustomerRegnController {
	
	@Autowired
	RegistrationService regnService;
	
	@Autowired
	LoginService loginService;
	
	
	/*	This is the Old Method which was just to show the 
		Data in the Confirmation Page and Not Saving in DB
	 	Initial Part of the Project */
	@PostMapping("/saveRegnDetails")
	public String saveCustomerRegnDetails(Model model,@ModelAttribute("registration") Registration customerRegn)
	{
		System.out.println("In Regn Process ");
		System.out.println("modifying id "+customerRegn.getId());
		regnService.saveRegistrationDetail(customerRegn);
		
		/*SIMULTANEOUSLY LOGIN TABLE SHOULD GET iNSERTED/UPDATED WITH USERNAME & PASSWORD
		FOR UPDATION , SHOULD CHECK IF RECORD EXIST AND THEN - SAVEORUPDATE to Be performed by
		DAO accordingly*/
		String userName = customerRegn.getLoginId();
		String password = customerRegn.getPassword();
		String eMail = customerRegn.geteMail();
		String role = customerRegn.getRole();
		int id = customerRegn.getId();
		Login loginCheck = new Login(userName,password,eMail,role);
		Login  login = loginService.getLoginById(id);
		
		System.out.println("Existing "+login);
		if(login != null)
		{
			login.setLoginId(userName) ;// Changing only New username & Password with Same ID
			login.setPassword(password);
			loginService.saveLogin(login);
		}
		else
		{
			loginService.saveLogin(loginCheck);
		}
		model.addAttribute("regnsuccess", "Congrats!!! Registered Successfully!!! Please Login");
		return "redirect:/greet/login";
	}
	
	//Fetch all Customer Regn Details
	
	
	@RequestMapping("/getAllCustomerRegnDetails")
	public String getAllCustomerRegnDetails(Model model)
	{
		List <Registration> customerRegnDetails;
		customerRegnDetails = regnService.getRegistrationDetails();
		model.addAttribute("customerRegnDetails", customerRegnDetails);
		return "/greet/customerRegnList";
	}
	
	@RequestMapping("/getStudentRegnDetailById")
	public Registration getStudentRegnById(int id)
	{
		Registration studentRegn = new Registration();
		return studentRegn;
	}
	//Save Student Registration Details
/*	@PostMapping("/registerStudentRegnDetail")
	public String registerStudent(@ModelAttribute("studRegn") StudentRegn studRegn)
	{
		System.out.println("In Process Regn");
		studentRegnService.saveStudentRegnDetail(studRegn);
		return "studentRegnList";
	}*/
	
	@PostMapping("/showFormForUpdate")
	public String showStudentRegnFormForUpdate(Model model,@RequestParam("studRegnId") int studRegnId)
	{
		Registration registrationDetails = regnService.getRegistrationDetailById(studRegnId);
		model.addAttribute("studentRegnDetails", registrationDetails);
		return "studentRegistrationForm";
		
	}
	@RequestMapping("/deleteRegnDetailById")
	public String deleteStudentRegnById(@RequestParam("custRegnId") int custRegnId)
	{
		regnService.deleteRegistrationDetailById(custRegnId);
		return "redirect:/greet/showRegnDetails";
	}
	
	


}
