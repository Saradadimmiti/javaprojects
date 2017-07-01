package Ooops3;
//} = + ] ' "
public class A {
	void hello(int i,double j){
		System.out.println("A");
	}
	void hello (double i,int j){
		System.out.println("B");
	}
	public static void main(String[] args) {
		A c=new A();
		c.hello(1, 2.0);
		c.hello(2.0, 2);
		
		
	}
// same method names but differ in their arguments 
}
