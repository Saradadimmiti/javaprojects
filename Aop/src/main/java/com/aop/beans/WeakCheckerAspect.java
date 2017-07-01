package com.aop.beans;

import org.aspectj.lang.JoinPoint;

public class WeakCheckerAspect {

	public void checker(JoinPoint jp,int key){
		
		System.out.println("After Returning advice");
		
		if(key<0)
			throw new IllegalArgumentException("weak key");
		
		
	}
}
