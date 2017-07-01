package interfaces;
//} = + ] ' " //
public class HPPrinter implements Printer {
	public void print(){
		System.out.println("Print logic in HPPrinter");
	}
	public static void main(String[] args) {
		Printer p=new HPPrinter();
		p.print();

}}
