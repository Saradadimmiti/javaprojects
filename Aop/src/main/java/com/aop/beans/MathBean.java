package com.aop.beans;

public class MathBean {

	public int add(int a, int b) {

		//throw new RuntimeException("wrong input");
		System.out.println("add method");
		return a + b;
	}

	public int subtract(int a, int b) {

		return a - b;
	}

}
