package reflection;

import java.lang.reflect.Method;

//} = + ] ' " //
public class C {
	public  void add(int i,int j){
		int r=i+j;
		System.out.println("Result is:"+r);
	}
	public static void main(String[] args)throws Exception {
		Class<?> clss=Class.forName("reflection.C");
		Method m=clss.getMethod("add", int.class,int.class);
		m.invoke(clss.newInstance(), 10,40);
	}

}
