package com.gl.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.shop.entity.Login;
import com.gl.shop.entity.Registration;
import com.gl.shop.service.LoginService;
import com.gl.shop.service.RegistrationService;



@Controller
@RequestMapping("/greet")
public class GreetingsController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	RegistrationService registrationService;
	
	
	@RequestMapping("/sayHello")
	public String greetPeople(Model model)
	{
		String message = "Welcome to the Online Shopping Site Home Page...";
		model.addAttribute("mymessage", message);
		return "homepage";
	}
	
	@RequestMapping("/login")
	public String showLoginPage(Model model)
	{
		String loginmsg = "Welcome to the Online Shopping Site  Login  Page...";
		
		Login login = new Login();
		String successmsg = (String) model.getAttribute("loginsuccess");
		if(successmsg != null)
		{
			model.addAttribute("loginsuccess", successmsg);
		}
		String[] roles = {"Admin","Customer","Seller"};
		model.addAttribute("roles", roles);
		model.addAttribute("loginmsg", loginmsg);
		model.addAttribute("login", login);
		return "loginpage";
	}
	/*@RequestMapping("/showStudentDetails")
	public String showStudentDetailsPage(Model model)
	{
		List <StudentDetails> studentDetails ;
		studentDetails = studentDetailService.getStudentDetails();
		System.out.println(studentDetails);
		model.addAttribute("studentDetails", studentDetails);
		return "studentsDetailsList";
					
	}*/
	@RequestMapping("/customerRegnList")
	public String showRegistrationDetailsPage(Model model)
	{
		List <Registration> registrationDetails;
		registrationDetails = registrationService.getRegistrationDetails();
		model.addAttribute("registrationDetails", registrationDetails);		
		return "customerRegnList";
		
	}
	@GetMapping("/register")
	public String showRegistrationPage(Model model)
	{
		String regmsg = "Welcome to the Customer Registration Page...";/* */
		
		Registration registration = new Registration();
		
		String[] roles = {"Admin","Customer","Seller"};
		model.addAttribute("roles", roles);
		model.addAttribute("registration", registration);
		model.addAttribute("regmsg", regmsg);
		return "registrationForm";
	}
	
	@PostMapping("/register")
	public String showConfirmationPage(@ModelAttribute("studRegn") Registration studRegn)
	{
		System.out.println("In Process Regn");
		return "confirmation";
	}
	
	@PostMapping("/login")
	public String showOnlineShoppingPage(@ModelAttribute("login") Login login)
	{
		if(loginService.validateLoginSvc(login) && login.getRole().equals("Customer"))
		{
			System.out.println("Login Details "+login);
			return "onlineShoppingPageCustomer";
		}
		else if (loginService.validateLoginSvc(login) && login.getRole().equals("Seller"))
		{
			System.out.println("Login Details "+login);
			return "onlineShoppingPageSeller";
		}
		else if (loginService.validateLoginSvc(login) && login.getRole().equals("Admin"))
		{
			System.out.println("Login Details "+login);
			return "onlineShoppingPageAdmin";
		}
		else
		{
			return "failedLogin";
		}
	}
	@RequestMapping("/validated")
	public String showOnlineShoppingPage()
	{
		return "onlineShoppingPage";
	}
	
	

}
