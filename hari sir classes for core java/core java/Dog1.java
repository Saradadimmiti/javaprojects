// } = + ] ' " //
class Dog1{
	static int objCount;
	Dog1(){
	objCount++;
	System.out.println("object count is:"+objCount);}
	public static void main(String[] args){
	new Dog1();
	new Dog1();
	new Dog1();
	}}
	//o/p:object count is 1
	   // object count is 2
	   // object count is 3