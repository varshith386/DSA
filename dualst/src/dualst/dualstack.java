package dualst;
import java.util.*;

public class dualstack {
	    int arr[];
	    int size;
	    int top1,top2;
	   
	    dualstack(int n){
	    	size=n;
	    	arr=new int[n];
	    	top1=n/2;
	    	top2=n/2+1;
	    }
	    void push1(int x){
	    	if(top1<size-1) {
	    		top1++;
	    		arr[top1]=x;
	    		}
	    	else {
	    		System.out.println("The stack is full");
	            return;
	      }
	    }
	    void push2(int x) {
	    	if(top2>0) {
	    		top2--;
	    		arr[top2]=x;
	    		}
	    	else {
	    		System.out.println("Stack is full");
	            return;
	      }
	    }
	    int pop1(){
	    	if(top1>=size/2+1) {
	    		int x=arr[top1];
	    		top1--;
	    		return x;
	    		}
	    	else {
	    		System.out.println("Stack is empty");
	    		System.exit(1);
	    		}
	    	return 1;
	    }
	    int pop2() {
	    	if(top2<=size/2) {
	    		int x=arr[top2];
	    		top2--;
	    		return x;
	    		}
	    	else {
	    		System.out.println("Empty Stack");
	    		System.exit(1);
	    		}
	    	return 1;
	    }
	    void display() {
	    	for(int i:arr) {
	    		System.out.println(" "+i);
		      }
		    }
		    public static void main(String args[]) {
		    	dualstack ts=new dualstack(5);
		    	ts.push1(5);
		    	ts.push2(7);
		    	ts.display();
		      
		    }
		}
	
