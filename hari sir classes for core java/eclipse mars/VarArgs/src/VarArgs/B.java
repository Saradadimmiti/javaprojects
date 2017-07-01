package VarArgs;
//} = + ] ' " //
public class B {
	static void add(int...i){
		int temp=0;
		for(int x:i){
			temp=temp+x;
		}
		System.out.println(temp);
		
	}
	public static void main(String[] args) {
		add(1,2,5,6);
		add(10,2,4,7,9,11);
		
	}



}
