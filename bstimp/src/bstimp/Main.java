package bstimp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 

		 

		 

		//Scanner a = new Scanner(System.in); 

		BST b = new BST(); 
		b.root=b.insert(b.root, 8);
		b.root=b.insert(b.root, 9);
		b.root=b.insert(b.root, 7);
		b.inorder(b.root);
		System.out.println("count: "+b.count(b.root));
		System.out.println("Leaf count: "+b.countleafnode(b.root));
		System.out.println("search "+b.search(b.root,7));
		b.del(b.root,8);
		b.inorder(b.root);
//		 
//
//		int ch=0; 
//
//		do { 
//
//		System.out.println("1:Insert"); 
//
//		System.out.println("2:Pre order"); 
//
//		System.out.println("3:In order"); 
//
//		System.out.println("4:Post order"); 
//
//		System.out.println("5:Count nodes"); 
//
//		System.out.println("6:Count leaf node"); 
//
//		System.out.println("7:Exit"); 
//
//		 
//
//		ch=a.nextInt(); 
//
//		 
//
//		switch(ch) { 
//
//		case 1: 
//
//		System.out.println("Enter the values:"); 
//
//		b.root=b.insert(b.root, a.nextInt()); 
//
//		break; 
//
//		case 2: 
//
//		b.preorder(b.root); 
//
//		break; 
//
//		case 3: 
//
//		b.inorder(b.root); 
//
//		break; 
//
//		case 4: 
//
//		b.postorder(b.root); 
//
//		break; 
//
//		case 5: 
//
//		System.out.println("Number of nodes:"); 
//
//		b.count(b.root); 
//
//		break; 
//
//		case 6: 
//
//		System.out.println("Number of leaf nodes:"); 
//
//		b.countleafnode(b.root); 
//
//		break; 
//
//		case 7: 
//
//		System.out.println("Exit"); 
//
//		break; 
//
//		 
//
//		} 
//
//		 
//
//		}while(ch<=7); 
//
		} 

		} 

		 

