package com.gl.play1;

public class InvalidAgeException extends Exception{
	
	String message;
	public InvalidAgeException(String message)
	{
		this.message = message;
	}

}
