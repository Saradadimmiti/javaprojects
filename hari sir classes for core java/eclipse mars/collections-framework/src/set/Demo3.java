package set;
import java.util.*;
//} = + ] ' " //
public class Demo3 {
	public static void main(String[] args) {
		Set<String> x=new TreeSet<String>(Collections.reverseOrder());
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



