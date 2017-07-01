package collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
//} = + ] ' " //
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B","C","D");
		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		Collections.shuffle(l1);
		for (String s : l1) {
			System.out.println(s);
			
		}
		}
		}



