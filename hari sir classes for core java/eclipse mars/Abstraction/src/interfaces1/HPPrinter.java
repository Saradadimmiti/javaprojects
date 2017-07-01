package interfaces1;
//} = + ] ' " //
public class HPPrinter implements Scanner {
	public void print(){
		System.out.println("HPPrinter print");
	}
	public void scan() {
		System.out.println("HPPrinter scan");
		
	}
	public static void main(String[] args) {
		Scanner scn=new HPPrinter();
		scn.print();
		scn.scan();
	}

}
