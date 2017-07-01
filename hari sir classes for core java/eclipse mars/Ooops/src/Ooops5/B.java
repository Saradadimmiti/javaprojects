package Ooops5;
//} = + ] ' "
public class B extends A{
	void halfWork(){
		super.halfWork();
		System.out.println("half work done by child");
	}
public static void main(String[] args) {
	B x=new B();
	x.halfWork();
}
}
