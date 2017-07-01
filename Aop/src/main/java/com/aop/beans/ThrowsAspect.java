package com.aop.beans;

import org.aspectj.lang.JoinPoint;

public class ThrowsAspect {
	
	
	public void handleException(JoinPoint jp,Exception e){
		
		System.out.println("Exception occurs at:"+jp.getSignature().getName()+e);
		
	}

}
