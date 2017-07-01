package overloading;
//} = + ] ' " //
public class Demo {
	void add(int i, int j){
		System.out.println(i+j);
	}
	void add(double i,double j){
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.add(10, 20);
		d.add(10.5, 20.5);
	}

}
