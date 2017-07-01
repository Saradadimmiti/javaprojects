package innerclass;
//} = + ] ' " //
public class A {
	static class Inner{
		void innerMethod(){
			System.out.println("welcome to innermethod");
		}
	}
public static void main(String[] args) {
	Inner i=new A.Inner();
	i.innerMethod();
}
}
