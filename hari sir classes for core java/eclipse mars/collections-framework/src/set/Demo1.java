package set;
import java.util.HashSet;
//} = + ] ' " //
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		Set<String> x=new TreeSet<>();
		// TreeSet maintains ascending order
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


