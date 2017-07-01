package gcDemo;
//} = + ] ' " //
public class Person {
	protected void finalize() throws Throwable {
		System.out.println("calling finalize method");
			}
	public static void main(String[] args) {
		Person p1=new Person();
		p1=null;
		System.gc();
	}

}
