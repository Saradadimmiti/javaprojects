package Ooops2;
//} = + ] ' "
public class ScientificCalc extends Calculator {
	void sin(double x){
		System.out.println("Sin result:"+Math.sin(x));
	}
	void cos(double x){
		System.out.println("Cos result:"+Math.sin(x));
	}
	public static void main(String[] args) {
		ScientificCalc s=new ScientificCalc();
		s.add(10,20);
		s.sub(10,20);
		s.sin(90.0);
		s.cos(60.0);
	}
	}

