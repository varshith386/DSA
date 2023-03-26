import java.util.PriorityQueue;

public class stacksusingqueues {
	PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
	PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();
	
	void push(int x) {
		q1.add(x);
	}
	
	//since not nested loops it takes O(n) time .
	int pop() {
		while(q1.size()>1) {
			q2.add(q1.remove());
		}
		int x;
		if(!q1.isEmpty()) {
			x = q1.remove();
		}else {
			x=-1;
		}
		
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {
		
		stacksusingqueues s1 = new stacksusingqueues();
		
		s1.push(1);
		System.out.println(s1.pop());
		s1.push(2);
		s1.push(3);
		s1.push(4);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
}

}
