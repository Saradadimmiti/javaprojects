package staticpolymorphic;
//} = + ] ' " //
public class A {
	void doStuff(Object x){
		System.out.println("A");
	}
	void doStuff(String x){
		System.out.println("B");
	}
	public static void main(String[] args) {
		Object obj="HI";
		A d=new A();
		d.doStuff(obj);
	}
// it takes object of reference type
}
