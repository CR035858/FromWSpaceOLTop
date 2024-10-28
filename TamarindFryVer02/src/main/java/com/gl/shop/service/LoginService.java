package com.gl.shop.service;

import com.gl.shop.entity.Login;

public interface LoginService {
	
	public boolean validateLoginSvc(Login login);
	
	public void saveLogin(Login login);
	
	public Login checkIfLoginExist(Login login);
	
	public Login getLoginById(int id);

}
