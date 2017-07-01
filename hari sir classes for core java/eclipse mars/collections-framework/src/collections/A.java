package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//} = + ] ' " //
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B","C","D");
		List<String> trdsf=Collections.synchronizedList(l1);// making threadsafe
	}

}
