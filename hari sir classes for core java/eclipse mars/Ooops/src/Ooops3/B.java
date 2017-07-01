package Ooops3;
//} = + ] ' "
public class B {
	void hello(int i,double j){
		System.out.println("A");
	}
	void hello (int i,double j){
		System.out.println("B");
	}
	public static void main(String[] args) {
		B c=new B();
		c.hello(1, 2.0);
		
	//it will get some error with same signature for two methods	
		
	}

}

