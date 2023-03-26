public class dualstack {
	int a[];
	int size;
	int top1;
	int top2;
	
	dualstack(int n){
		size=n;
		top1=n/2;
		top2=n/2+1;
		a=new int[n];
	}
	
	void push1(int x) {
		if(top1<size-1) {
			top1++;
			a[top1]=x;
		}
		else {
			System.out.println("Full Stack");
		}
	}
	
		void push2(int x) {
			if(top2>=0) {
				top2--;
				a[top2]=x;
		}
			else {
				System.out.println("Full Stack");
			}
	}
		
		int pop1() {
			if(top1>=size/2+1) {
				int x=a[top1];
				top1--;	
				return x;
			}
			else {
				System.out.print("Emptry Stack");
				System.exit(1);
			}
			return 1;
		}
		
		int pop2() {
			if(top2<=size/2) {
				int x=a[top2];
				top2++;
				return x;
			}
			else {
				System.out.print("Empty Stack");
				System.exit(1);
			}
			return 1;
		}
		void disp() {
			for(int i: a) {
				System.out.print(""+i);
			}
		}

		public static void main(String[] args) {
			dualstack st=new dualstack(5);
			st.push1(4);
			st.push1(2);
			st.push2(3);
			st.push2(6);
			st.disp();
			System.out.println("\nPopped element:"+st.pop1());
			
	
}
}