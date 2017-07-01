package com.aop.beans;

import org.aspectj.lang.annotation.Pointcut;

public abstract class ApplicationPointcut {
	
	@Pointcut("execution(* com.aop.beans.MathBean.add(..))")
	public void methodPointCut() {

	}

}
