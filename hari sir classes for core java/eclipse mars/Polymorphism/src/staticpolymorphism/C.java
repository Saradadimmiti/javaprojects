package staticpolymorphism;
//} = + ] ' " //
public class C extends B{
	void y(){
		System.out.println("B");
	}
	public static void main(String[] args) {
		C c=new C();
		c.x();
	}
}
