package exceptionhandling;


//} = + ] ' " //
public class I {
	public static void main(String[] args) {
		 
		
		try{
			System.out.println("A");
			int i=10/0; // Arithmetic Exception
			System.out.println("B");
		}
		catch(ArithmeticException e){
			System.out.println("C");
		}
		// using multiple catch blocks
		catch(NullPointerException e){
			System.out.println("D");
		}
	}

}


