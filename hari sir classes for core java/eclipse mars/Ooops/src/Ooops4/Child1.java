package Ooops4;
//} = + ] ' "
public class Child1 extends Parent {
	void walk(){
		super.walk(); // invokes parent class
		System.out.println("Walk like child");
		//using super keyword in over riding
	}
	public static void main(String[] args) {
		Child1 x=new Child1();
		x.walk();
		x.eat();
		
		
	}}



