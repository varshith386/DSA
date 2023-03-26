package qimp;

public class queue {
	int queue[] = new int[5];
	int size;
	int head;
	int tail;
	
	
	public void enqueue(int data)
	{
		if(!full())
		{
		queue[tail]=data;
		tail= (tail +1)%5;
		size = size +1;
		}
		else
		{
			System.out.println("queue is full");
		}
		
	}
	
	public int dequeue()
	{
		
		int data = queue[head];
		if(!empty())
		{
		head = (head +1)%5;
		size = size -1;
		}
		else {
			System.out.println("queue is empty");
		}
		
		return data;
		
	}
	
	public void show()
	{
		System.out.println("Elements:");
		for(int i=0;i<=size;i++)
		{
			System.out.print(queue[(head+i)%5]+" ");
		}
	}
	
	public int size()
	{
		return size;
	}
	public boolean empty()
	{
		return size == 0 ;
		
	}
	public boolean full()
	{
		return size == 5 ;
		
	}

}
