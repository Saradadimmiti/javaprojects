package set;
import java.util.HashSet;
//} = + ] ' " //
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<String> x=new HashSet<>();
		x.add("A");
		x.add("S");
		x.add("x");
		x.add("D");
		x.add("A"); // this duplicate is rejected
		for (String s : x) {
			System.out.println(s);
			
		}
	}

}
