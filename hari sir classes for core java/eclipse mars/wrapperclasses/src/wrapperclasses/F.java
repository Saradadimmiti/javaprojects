package wrapperclasses;
//} = + ] ' " //
public class F {
	void doStuff(int i){
		System.out.println("primitive");
	}
	void dostuff(Integer i){
		System.out.println("wrapper");
	}
	public static void main(String[] args) {
		F d=new F();
		d.doStuff(10);
	}

}
