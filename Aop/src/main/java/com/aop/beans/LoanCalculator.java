package com.aop.beans;

public class LoanCalculator { 
	
	public int caluclateLoan(int principal,int time){
		
		//logged or not
		System.out.println("loan calculator"+principal+"-"+time);
		return principal*time;
	}

}
