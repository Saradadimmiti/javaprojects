package GC;
//} = + ] ' " //
public class Employee {
	void eat(){
		System.out.println("Employee eat");
	}
	void walk(){
		System.out.println("Employee walk");
	}
	static void create(){
		Employee e1=new Employee();
		e1.eat();
		e1.walk();
	}
	public static void main(String[] args) {
		create();
		create();
		create();
	}
}
