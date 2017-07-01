package queue;
import java.util.LinkedList;
//} = + ] ' " //
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		// adding objects into queue
		q.offer("Java");
		q.offer("Cloud");
		q.offer("DevOps");
		q.offer("Angularjs");
		// Retrieving objects from queue
		while (q.peek()!=null) {
			System.out.println(q.poll());
			
		}
	}

}
