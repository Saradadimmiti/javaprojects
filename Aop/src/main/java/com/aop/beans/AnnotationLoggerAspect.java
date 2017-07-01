package com.aop.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotationLoggerAspect extends ApplicationPointcut{

	

	@Around("methodPointCut()")
	public int aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

		Object[] args = pjp.getArgs();

		System.out.println("---------Annotation---------");
		System.out.println("Actual arguments" + args[0] + "-" + args[1]);

		args[0] = (Integer) args[0] + 10;

		System.out.println("Logging Aspect call before method-- changed arguments" + args[0] + "-" + args[1]);

		// int returnval=0;
		int returnval = (Integer) pjp.proceed(args);

		System.out.println("Logging Aspect call after method" + returnval);

		return returnval + 10;

	}

	@Before("methodPointCut()")
	public void beforeAdvice(JoinPoint jp) throws IllegalAccessException {

		System.out.println("Before Advice");

		Object[] args = jp.getArgs();

		for (Object arg : args) {

			System.out.println("arguments--" + arg);
		}

		AuthenticationManager am = new AuthenticationManager();
		if (!am.isAuthenticated())
			throw new IllegalAccessException("Invalid uname and password");

		args[0] = (Integer) args[0] + 123;

	}
	
	@AfterReturning(value="methodPointCut()",returning="result")
	public void afterReturning(JoinPoint jp,int result){
		System.out.println("After Returning--"+result);
	}
	
	@AfterThrowing(value="methodPointCut()",throwing="exception")
	public void throwsAdvice(JoinPoint jp,Exception exception){
		
		System.out.println("exception at:::: "+jp.getSignature().getName()+"-"+exception);
			
	}
}
