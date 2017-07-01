package VarArgs;

public class A {
	static void add(int...i){
		for(int x:i){
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		add(1,2,5,6);
		add(10,2,4,7,9,11);
		
	}

}
