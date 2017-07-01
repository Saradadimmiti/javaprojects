package thisk;
//} = + ] ' " //
public class Person {
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Person p1=new Person("Rama", 20);
		System.out.println(p1.name);
		System.out.println(p1.age);
	}

}
