/*Queues=== FIFO Fist in Fist out
 * Adding element     enqueue    == add()  or  offer()       rear++
 * Deleting element   dequeue    == remove() or poll()       front++
 * 
 * 
 * Element is added at the tail
 * Element is deleted at the tail
 * 
 * Head ele1 ele2 ele3 ele3 Tail
 */
package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) {
	Queue<String> queue = new LinkedList<String>();
	
	queue.add("a");// adding element
	queue.add("b");
	queue.add("c");
	queue.add("d");
	
	
	System.out.println("The Queue is: "+queue);
	System.out.println("The first element is: "+queue.peek()); // displaying the first element
	
	
	queue.remove("c");// deleting element
	System.out.println("The edited Queue is: "+queue);
	
	
	
	
	}
}
