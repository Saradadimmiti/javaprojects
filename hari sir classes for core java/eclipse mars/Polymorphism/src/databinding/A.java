package databinding;
//} = + ] ' " //
 class B {
	int i=6;

}
 class A extends B{
	 int i=7;
	 public static void main(String[] args) {
		B b=new A();
		System.out.println(b.i);
	}
	 
 }
