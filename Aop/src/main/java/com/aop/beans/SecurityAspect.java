package com.aop.beans;

import org.aspectj.lang.JoinPoint;

public class SecurityAspect {
	
	public void checkLogin(JoinPoint jp) throws IllegalAccessException{
		
		System.out.println("Before Advice");
		
		Object[] args=jp.getArgs();
		
		for(Object arg:args){
			
			System.out.println("arguments--"+arg);
		}
		
		AuthenticationManager am=new AuthenticationManager();
		if(!am.isAuthenticated())
			throw new IllegalAccessException("Invalid uname and password");
		
		
		
		args[0]=(Integer)args[0]+123;
		
		
		
	}

}
