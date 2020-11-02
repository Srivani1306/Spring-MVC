package com.spring;



public class LoginModel {

	public static boolean isValid(String user,String pass) {
		if(user.equals(pass)) {
			return true;
		}
			
		return false;
	}
}
