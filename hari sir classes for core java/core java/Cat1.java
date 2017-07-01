// } = + ] ' " //
//calling a constructor from another constructor
class Cat1{
	Cat1(String name){
		System.out.println("name is:"+name);}
	Cat1(int age,String name){
		this(name);//invoking a constructor
		System.out.println("age is:"+age);	}
	public static void main(String[] args){
		new Cat1("some cat");
		new Cat1(3,"puupy");}}
	//o/p:name is:some cat
	    //name is:puupy
	    //age is:3