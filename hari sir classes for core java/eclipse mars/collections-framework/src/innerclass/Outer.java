package innerclass;
//} = + ] ' " //
public class Outer {
	class Inner{
		void innerMethod(){
			System.out.println("welcome to innermethod");
		}
	}
public static void main(String[] args) {
	Inner i=new Outer().new Inner();
	i.innerMethod();
}
}
