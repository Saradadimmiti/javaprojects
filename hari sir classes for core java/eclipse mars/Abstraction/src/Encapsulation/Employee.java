package Encapsulation;
//} = + ] ' " //
public class Employee {
	private int age;
	private String name;
	private boolean manager;
	public String getName(){
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public boolean isManager(){
		return manager;
	}
	public void setManager(boolean manager) {
		this.manager=manager;
	}
	public int getAge(){
		return age;
	}
	public void  setAge(int age) {
		if(age<20||age>50)
		{throw new RuntimeException("Invalid age");}
		this.age=age;
		}
	} 
	

	
