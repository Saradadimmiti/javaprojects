package VarArgs;
//} = + ] ' " //
public class D {
	static void x(int...i ){
		System.out.println("i");}
	static void x(int i,int j){
		System.out.println("i,j");
		
	}
	public static void main(String[] args) {
		x(10,20);
	}

}
