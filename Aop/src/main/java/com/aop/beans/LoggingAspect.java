package com.aop.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	
	public Object log(ProceedingJoinPoint pjp) throws Throwable{
		
		Object[] args=pjp.getArgs();
		
		System.out.println("Actual arguments"+args[0]+"-"+args[1]);
		
		args[0]=(Integer)args[0]+10;
		
		
		
		System.out.println("Logging Aspect call before method-- changed arguments"+args[0]+"-"+args[1]);
		
		//int returnval=0;
		int returnval=(Integer)pjp.proceed(args);
		
		
		System.out.println("Logging Aspect call after method"+returnval);
		
		return returnval+10;
		
	}
	
	

}
