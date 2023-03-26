package qimp;

public class q {
	public static void main(String[] args) {
		queue Q = new queue();
		
		Q.enqueue(4);
		Q.enqueue(1);
		Q.enqueue(2);
		Q.enqueue(3);
		
		
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		
		Q.enqueue(6);
		Q.enqueue(7);
		Q.enqueue(8);			
		
		Q.show();
		System.out.println("\nsize:"+Q.size);
		System.out.println("empty :"+Q.empty());
		System.out.println("full :"+Q.full());
		
		

	}

}
