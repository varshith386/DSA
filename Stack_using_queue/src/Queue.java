import java.util.Stack;

public class Queue {
	Stack<Integer> S1=new Stack<Integer>();
    Stack<Integer> S2=new Stack<Integer>();
void enqueue(int x){
    S1.push(x);
}
int dequeue(){
    while(!S1.empty()){
        S2.push(S1.pop());
    }
    int r=S2.pop();
    while(!S2.empty()){
        S1.push(S2.pop());
    }
return r;}

public static void main(String[] args){
    Queue q1=new Queue();
    q1.enqueue(2);
    q1.enqueue(3);
    q1.enqueue(4);
    System.out.println(q1.dequeue());
    q1.enqueue(5);
    System.out.println(q1.dequeue());
}

}
