import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		//Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());  For reverse order
		
		
		queue.add("b");// adding element
		queue.add("d");
		queue.add("c");
		queue.add("a");
		
		
		System.out.println("The Queue is: "+queue);

	}

}
