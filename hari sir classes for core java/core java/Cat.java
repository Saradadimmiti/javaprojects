// } = + ] ' " //
//overload constructors
class Cat{
	Cat(String name){
		System.out.println("name is:"+name);}
	Cat(int age,String name){
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);	}
	public static void main(String[] args){
		new Cat("some cat");
		new Cat(3,"puupy");}}
	//o/p:name is:some cat
	    //name is:puupy
	    //age is:3