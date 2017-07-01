package overriding;

public class B extends A {
	private void doStuff() {
		System.out.println("B");
		// cannot reduce the visibility of the inherited method from A 
		
	}

}
