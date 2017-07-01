package Ooops10;
//} = + ] ' "
//hybrid inheritance with interfaces
public class D implements B,C {
	public void show(){
		System.out.println("show() method of implementation");
	}
	public void dispD(){
		System.out.println("dispD() method of D");
	}
	public static void main(String[] args) {
		D d=new D();
		d.dispD();
		d.show();
	}

}
