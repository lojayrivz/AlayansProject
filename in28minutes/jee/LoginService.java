package com.in28minutes.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		if(user.equalsIgnoreCase("admin") && password.equals("admin")){
			return true;
		}else if(user.equalsIgnoreCase("faci") && password.equals("faci")){
			return true;
		}else if(user.equalsIgnoreCase("super") && password.equals("super")){
			return true;
		}else if(user.equalsIgnoreCase("trainee") && password.equals("trainee")){
			return true;
		}else
			return false;
	}
	
	public int validateType(String user, String password) {
		
		if(user.equalsIgnoreCase("admin") && password.equals("admin")){
			return 1;
		}else if(user.equalsIgnoreCase("faci") && password.equals("faci")){
			return 2;
		}else if(user.equalsIgnoreCase("super") && password.equals("super")){
			return 3;
		}else if(user.equalsIgnoreCase("trainee") && password.equals("trainee")){
			return 4;
		}else
			return 0;
	}

}