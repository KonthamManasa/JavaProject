package com.hb.customexception;

public class LoginFailedException extends Exception{
	public LoginFailedException(String msg)
	{
		super(msg);
		System.out.println("Try again with your credintials");
	}
}
