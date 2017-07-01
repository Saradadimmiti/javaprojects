package innerclass;
//} = + ] ' " //
public class B {
	public static void main(String[] args) {
		Outer.Inner i=new Outer().new Inner();
		i.innerMethod();
	}

}
