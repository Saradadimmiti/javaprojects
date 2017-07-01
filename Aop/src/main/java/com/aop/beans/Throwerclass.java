package com.aop.beans;

public class Throwerclass {
	
	
	public int raiseException(int value){
		
		if(value<0)
			throw new IllegalArgumentException();
		
		return value;
		
	}

}
