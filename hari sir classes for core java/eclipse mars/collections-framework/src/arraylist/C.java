package arraylist;
//} = + ] ' " //
import java.util.List;
import java.util.ArrayList;

public class C {
	public static void main(String[] args) {
		// creating arraylist object
		List li=new ArrayList();
		// add objects into list
		li.add("java");
		li.add("cloud");
		li.add("DeVops");
		li.add("java");
		li.add(new Integer(10));
		for (int i = 0; i < li.size(); i++) {
			
		// for loop
			System.out.println(li.get(i));
			
		}
	}
	// retrieving elements from the list
	

}


