package exceptionhandling;

public class C {
	public static void main(String[] args) {
		Object x=new Integer(10);
		if(x instanceof String){ // this is resolution
			String s=(String)x; // classcast Exception
	}


}
}
