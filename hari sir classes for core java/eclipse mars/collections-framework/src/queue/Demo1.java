package queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
//} = + ] ' " //
import java.util.Queue;

public class Demo1 {
	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>() ;
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
