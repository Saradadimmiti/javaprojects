package exceptionhandling;
//} = + ] ' " //
public class H {
	public static void main(String[] args) {
		int i=10/0; // Arithmetic Exception
		// abnormal termination
		try{
			System.out.println("A");
			System.out.println("B");
		}
		catch(Exception e){
			System.out.println("C");
		}
	}

}

