package arraylist;
//} = + ] ' " //
import java.util.List;
import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		// creating arraylist object
		List li=new ArrayList();
		// add objects into list
		li.add("java");
		li.add("cloud");
		li.add("DeVops");
		li.add("java");
		li.add(new Integer(10));
		for (Object x : li) {
			// foreach loop/using enhanced for loop
			System.out.println(x);
			
		}
	}
	// retrieving elements from the list
	

}

