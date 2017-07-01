package gcDemo;
//} = + ] ' " //
public class App {
	public static void main(String[] args) {
		System.gc();
		// requesting gc to run by static method
		Runtime rt=Runtime.getRuntime();
		rt.gc();
		// requesting gc to run by instance method
	}

}
