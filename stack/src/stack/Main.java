/*Stack === FILO First in last out
 * Adding elements                push
 * Deleting element               pop
 * Searching element              search
 * Viewing topmost element        peak
 */

package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("a");  // Adding elements to the stack
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		System.out.println("Is the stack empty?\n"+stack.empty()); // Checks if stack is empty or full
		System.out.println("before popping\n"+stack); //Prints the stack
		
		stack.pop();
		System.out.println("After popping\n"+stack);
		
		
		String ele =stack.pop();  //For printing popped element
		System.out.println("Popped element:  "+ele);  
		
		
		System.out.println(stack);
		System.out.println("Topmost element of the stack: "+stack.peek());  // To print topmost element of the stack without popping it
		System.out.println("Position of C: "+stack.search("c"));  //For searching element c
		
		
		for(int i=0; i <10; i++) {
			stack.push("f");
			System.out.println(stack);
		}

	}

}
