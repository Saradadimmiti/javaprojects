package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//} = + ] ' " //
public class B {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B","C","D");
		List<String> x=Collections.unmodifiableList(l1);
		x.add("R");
	}

}
