package customeexceptions;
//} = + ] ' " //
public class ThrowsDemo {
	public static void main(String[] args) {
		Bank b=new Bank();
		try {
			b.validatePin(-123);
		} 
		catch (InvalidPinException e) {
			System.out.println("Dear User:"+e.getMessage());
		}
	}

}
