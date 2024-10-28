package com.gl.glca27may;

public interface Account extends CCAccount,DBAccount{

	public void checkBalance();
	public void checkInterestRate();
}
