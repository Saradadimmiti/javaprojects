package collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
//} = + ] ' " //
import java.util.List;

public class CopyDemo {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B","C","D");
		List<String> l2=Arrays.asList("","","","");
		Collections.copy(l2, l1);
		for(String s:l2){
			System.out.println(s);}
		}

}
