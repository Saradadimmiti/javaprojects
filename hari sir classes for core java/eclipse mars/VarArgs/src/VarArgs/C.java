package VarArgs;
//} = + ] ' " //
public class C {
	static void add(String...i){
		for(String x:i){
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		add("name","java","home","args");
		
	}

}
