package exceptionhandling;
//} = + ] ' " //
public class G {
	public static void main(String[] args) {
		System.out.println("A");
		try{
			int i=10/0;
			System.out.println("B");
		}
		catch(Exception e){
			System.out.println("C");
		}
		// normal termination
	}

}
