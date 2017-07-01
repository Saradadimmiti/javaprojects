package stack;
//} = + ] ' " //
import java.util.Stack;

public class A {
	
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("Rama");
		st.push("Sita");
		st.push("Lakshman");
		st.push("Hari");
		while(!st.empty()){
			System.out.println(st.pop());
		}
	}

}
