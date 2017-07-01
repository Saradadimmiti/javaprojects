package cloneDemo;
//} = + ] ' " //
public class Person implements Cloneable{
	String name;
	int age;
	public static void main(String[] args) throws Exception {
		Person p1=new Person();
		p1.name="rama";
		p1.age=24;
		Person p2=(Person)p1.clone();
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
	}

}
