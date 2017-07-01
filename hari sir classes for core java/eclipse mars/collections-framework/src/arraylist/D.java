package arraylist;
//} = + ] ' " //
import java.util.List;


import java.util.ArrayList;
import java.util.Iterator;

public class D {
	public static void main(String[] args) {
		// creating arraylist object
		List li=new ArrayList();
		// add objects into list
		li.add("java");
		li.add("cloud");
		li.add("DeVops");
		li.add("java");
		li.add(new Integer(10));
		Iterator itr=li.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	// retrieving elements from the list
	

}


