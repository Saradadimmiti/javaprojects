package Ooops7;
// multi level inheritance
public class C extends B {
	public void dispC(){
		System.out.println("dispC() method of C");
	}
	public static void main(String[] args) {
		C c=new C();
		c.dispA();
		c.dispB();
		c.dispC();
	}

}

