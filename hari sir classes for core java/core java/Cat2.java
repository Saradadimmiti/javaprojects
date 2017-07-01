// } = + ] ' " //
//call to the constructor must be the 1st statement
class Cat2{
	Cat2(String name){
		System.out.println("name is:"+name);}
	Cat2(int age,String name){
		System.out.println("age is:"+age);
		this(name);//invoking a constructor
			}
	public static void main(String[] args){
		new Cat2("some cat");
		new Cat2(3,"puupy");}}
	//o/p:error
	//ce:call to this must be first statement in constructor