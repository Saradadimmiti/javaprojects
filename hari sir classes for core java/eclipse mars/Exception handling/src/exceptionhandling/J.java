package exceptionhandling;


//} = + ] ' " //
public class J {
	public static void main(String[] args) {
		 
		
		try{
			System.out.println("A");
			
			String s=null;
			s.length();
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


