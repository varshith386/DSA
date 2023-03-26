package linkedlist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		/*ll.push("a");                LL Using stack operations
		ll.push("d");
		ll.push("s");
		ll.push("e");
		ll.push("c");
		
		System.out.println(ll);*/
		
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		
		ll.addFirst("u");
		ll.addLast("v");
		
		
		ll.add(3,"x");
		ll.remove("e");
		
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		
		
		

	}

}
