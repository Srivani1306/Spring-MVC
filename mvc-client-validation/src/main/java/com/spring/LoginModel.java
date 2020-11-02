package com.spring;

public class LoginModel {

	public  boolean isValid(String user,String pass) {
		
		if(user.equals(pass)) {
			return true;
		}
		    return false;
	}
}
