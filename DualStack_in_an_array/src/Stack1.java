
import java.util.Scanner;

public class Stack1 {
	
	Scanner sc=new Scanner(System.in); 
	
	int cap =5;
	int stack[] = new int [cap];
	int x = 0;
	
	public void push(int data) 
	{
		if(size()==cap) {
			expand();
		}
		else
		{
		stack[x]=data;
		x++;
		}
	
	}
	
	private void expand() {
		int length = size();
		int newstack[] = new int[cap*2];
		System.arraycopy(stack,0,newstack,0,length);
		stack = newstack;
		cap*=2;
		
		
	}

	public int pop()
	{
		int data=0;
		if(empty())
		{
			System.out.println("stack is empty");
		}
		else
		{
		x--;
		data = stack[x];
		stack[x] = 0;
		
		shrink();
		
		//System.out.println(data);
		
		}
		return data;
		
	}
	private void shrink() {
		int length = size();
		if(length<=(cap/2)/2) {
			cap=cap/2;
			int newstack[] = new int[cap*2];
			System.arraycopy(stack,0,newstack,0,length);
			stack = newstack;
			
			
			
		}
		
		
	}

	public int peek()
	{
		int data;
		data = stack[x-1];
		
		
		//System.out.println(data);
		
		return data;
		
	}
	
	public int size()
	{
		return x;
	}
	public boolean empty()
	{
		return x<=0 ;
	}
	
	public void show()
	{
		for(int n : stack) 
		{
			System.out.println(" "+n);
		}
	}

}
