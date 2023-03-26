package bstimp;

public class BST {
	node root;
	
	BST(){
		root = null;
	}
	BST(int a){
		root= new node(a);
	}
	
	node insert(node r, int x) 
	{
		if(r==null) 
		{
			r= new node(x);
			return r;
		}
		else
			if(x<r.data)
			{
				r.left = insert(r.left,x);
			}
			else
				if(x>r.data)
				{
					r.right = insert(r.right,x);
				}
		return r;
	}
	
	void preorder(node r) 
	{
		if(r!=null)
		{
			System.out.print(r.data);
			preorder(r.left);
			preorder(r.right);
		}
	}
	void inorder(node r) 
	{
		if(r!=null)
		{
			inorder(r.left);
			System.out.print(r.data);
			inorder(r.right);
		}
	}
	void postorder(node r) 
	{
		if(r!=null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data);
		}
	}
	int count(node r)
	{
		if(r==null)
		{
		 return 0;						
		}
		else {
			return 1+count(r.left)+count(r.right);
		}
	}
	int countleafnode(node r)
	{
		if(r==null)
		{
          return 0;
		}
		else if(r.left==null&&r.right==null) {
			return 1;
		}
		else {
			return countleafnode(r.left)+countleafnode(r.right);
		}
	}
	node largest(node r) {
		node p = r;
		while(p.right !=null)
			p = p.right;
		return p;	
	}
	
	node smallest(node r) {
		node p = r;
		while(p.left !=null)
			p = p.left;
		return p;	
	}
	
	boolean search(node r, int x) {
		if(r == null) 
			return false;
		int s = Integer.compare(x, r.data);
		if(s<0)
			return search(r.left,x);
		if(s>0)
			return search(r.right,x);
		else
			return true;
	}
	node del(node r, int x) {
		if(r == null) 
			return null;
		int s = Integer.compare(x, r.data);
		if(s<0)
			r.left = del(r.left,x);
		else if(s>0)
			r.right = del(r.right,x);
		else {
			if(r.left == null) {
				node rightchild = r.right;
				r.data =0;
				r = null;
				return rightchild;
			}
			else if(r.right == null) {
					node leftchild = r.left;
					r.data =0;
					r = null;
					return leftchild;
				}
			else {
				node temp = smallest(r.right);
				r.data = temp.data;
				r.right=del(r.right,temp.data);
			}	
		}
		return r;					
	}
	
	
}
