package com.gl.inter;

public class MyAccount implements Account,CCAccount,DCAccount{

	

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account Created");
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account CLOSED");
	}

	@Override
	public void calculatePremium() {
		// TODO Auto-generated method stub
		System.out.println("PREMIUM CALCULATED");
		
	}

	@Override
	public void createPolicy() {
		// TODO Auto-generated method stub
		System.out.println("POLICY CREATED");
	}

	@Override
	public void terminatePolicy() {
		// TODO Auto-generated method stub
		System.out.println("POLICY TERMINATED");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("BALANCE IS .....");
	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("INTEREST CALCULATED....");
	}

	@Override
	public void checkOutstanding() {
		// TODO Auto-generated method stub
		System.out.println("CC OUTSTANDING IS .....");
	}

	@Override
	public void calculateCreditPoints() {
		// TODO Auto-generated method stub
		System.out.println("CREDIT POINTS ARE.....");
	}

	@Override
	public void viewTransaction() {
		// TODO Auto-generated method stub
		System.out.println("YOUR TRANSACTIONS ARE");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAccount mac = new MyAccount();
		mac.createAccount();
		mac.checkBalance();
		mac.viewTransaction();
		
		mac.calculatePremium();
		mac.calculateCreditPoints();
		
		mac.checkOutstanding();
		mac.createPolicy();
		
		mac.terminatePolicy();
		mac.closeAccount();
		

	}

}
