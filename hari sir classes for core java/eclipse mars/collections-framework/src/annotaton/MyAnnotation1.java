package annotaton;

import java.lang.reflect.Method;

//} = + ] ' " 
public class MyAnnotation1 {
	@MyAnnotation(value=19)
	public void sayHello(){
		System.out.println("welcome to hello");
	}
	public static void main(String[] args) throws Exception  {
		MyAnnotation1 mann=new MyAnnotation1();
	Method m=mann.getClass().getMethod("sayHello");
			MyAnnotation my=m.getAnnotation(MyAnnotation.class);
			System.out.println("value for:"+my.value());
	}

}
