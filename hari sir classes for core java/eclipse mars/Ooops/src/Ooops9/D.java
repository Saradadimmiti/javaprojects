package Ooops9;
//} = + ] ' "
// Hybrid inheritance with classes
public class D extends B,C {
	public void dispD(){
		System.out.println("dispD() method of D");
	}
	public static void main(String[] args) {
		D d=new D();
		d.dispD();
		d.show();
	}
}
// error