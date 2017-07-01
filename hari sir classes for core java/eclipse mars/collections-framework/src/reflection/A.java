package reflection;

import java.util.Scanner;

//} = + ] ' " //
class Car{
	
}

public class A {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter class name ");
		String clzName=s.next();
		Class<?> clss=Class.forName(clzName);
		Object instance=clss.newInstance();
		System.out.println("Object for:"+instance.getClass());
		
		
	}

}
