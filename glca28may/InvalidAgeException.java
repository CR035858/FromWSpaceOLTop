package com.gl.glca28may;

public class InvalidAgeException extends Exception {

	String message;
	public InvalidAgeException(String message)
	{
		this.message = message;
	}
}
