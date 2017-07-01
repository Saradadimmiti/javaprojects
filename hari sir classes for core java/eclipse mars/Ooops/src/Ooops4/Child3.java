package Ooops4;
//} = + ] ' "
public class Child3 extends Parent {
	void walk(){
		
		System.out.println("Walk like child");
		super.walk(); //invokes parent class
		//using super keyword in over riding
	}
	public static void main(String[] args) {
		Child3 x=new Child3();
		x.walk();
		x.eat();
		
		
	}}



