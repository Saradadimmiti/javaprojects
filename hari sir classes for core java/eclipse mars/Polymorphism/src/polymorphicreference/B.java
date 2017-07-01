package polymorphicreference;
//} = + ] ' " //
public class B extends A{
	void y(){
		
	}
	public static void main(String[] args) {
		A a=new B();
		a.y();
	}
	// the method y() is undefined for the type A
}
