// } = + ] ' " //
//creatingobject//
// } = + ] ' " //
class Person{
	int age;
	String name;
	void details(){
	System.out.println("name is:"+name);
	System.out.println("age is:"+age);
	}
	public static void main(String[] args){
	Person p1=new Person();
	//syntax to  create an object
	Person p2=new Person();
	Person p3=new Person();
	p1.age=20;p1.name="sita";
	p2.age=24;p2.name="rama";
	p3.age=25;p3.name="lakshman";
	p1.details();p2.details();
	p3.details();}}
