package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;
//} = + ] ' " //
public class B {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter class name ");
		String clzName=s.next();
		Class<?> clss=Class.forName(clzName);
		Method[] methods=clss.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			
		}
		
		
	}

}
