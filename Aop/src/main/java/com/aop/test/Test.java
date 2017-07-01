package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.AuthenticationManager;
import com.aop.beans.LoanCalculator;
import com.aop.beans.MathBean;
import com.aop.beans.OtpGenerationBean;
import com.aop.beans.Throwerclass;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("./com/aop/common/ApplicationContext.xml");
		
		AuthenticationManager am=new AuthenticationManager();
		am.login("john", "xyz");
		
		MathBean mathBean=ctx.getBean("mathBean",MathBean.class);
		
		System.out.println("className--"+mathBean.getClass().getName());
		
		int result=mathBean.add(2, 3);
		
		//System.out.println("result--"+result);
		/*AuthenticationManager am=new AuthenticationManager();
		am.login("john", "xyz");
		
		LoanCalculator loanBean=ctx.getBean("loanBean",LoanCalculator.class);
		
		loanBean.caluclateLoan(200, 3);*/
		
		//OtpGenerationBean otpGenerationBean=ctx.getBean("otpBean",OtpGenerationBean.class);
		
		//int key=otpGenerationBean.generateOtp();
		
		//System.out.println("key----"+key);
		
		//Throwerclass throwerclass=ctx.getBean("throwableBean",Throwerclass.class);
		
		//throwerclass.raiseException(-3);
		
		
	}

}
