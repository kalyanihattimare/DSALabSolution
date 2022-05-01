package com.greatlearning.dsalab.q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
       
        tree.insert(17);
        tree.insert(10);
        tree.insert(23);
        tree.insert(9);
        tree.insert(14);
        tree.insert(18);
        tree.insert(35);
        
        System.out.println("Enter the sum to check if nodes are present");
        int target=in.nextInt();
        System.out.println("Sum is: "+ target);
        tree.isPairPresent(tree.root, target);

	}

}
