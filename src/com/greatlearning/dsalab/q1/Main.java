package com.greatlearning.dsalab.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		BalancedBrackets b=new BalancedBrackets();
		
		System.out.println("Enter the string of brackets to check if its balanced or not");
		String expr=in.nextLine();
		
		 
        // Function call
        if (b.BracketsBalanced(expr))
            System.out.println("The entered String has Balanced Brackets ");
        else
            System.out.println(" The entered Strings do not contain Balanced Brackets ");

	}

}
