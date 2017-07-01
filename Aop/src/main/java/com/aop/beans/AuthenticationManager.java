package com.aop.beans;

public class AuthenticationManager {

	private static boolean flag = false;

	public void login(String uname, String pwd) {

		if (uname.equals("john") && pwd.equals("xyz"))
			flag = true;
	}

	 boolean isAuthenticated() {
		return flag;
	}

}
