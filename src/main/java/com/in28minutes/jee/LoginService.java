package com.in28minutes.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("lojayrivz") && password.equals("092197");
	}

}