package week6_String;

import java.util.Scanner;

public class Question92_Faktoriel {

	public static void main(String[] args) {
		// olcay // Jul 8, 2020
		
	/*	In mathematics, the factorial of a positive integer n, denoted by n!,
		is the product of all positive integers less than or equal to n. 
		Calculate factorial and output result to the console. 
		Example:
		input: 5
		output: 120
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
	    int n = scan.nextInt();
	    
	    
	    long total=1;
	    for(int i=1; i<=n; i++) {
	    	
	    	total = total*i; 
	    
	    }
	    	
	    System.out.println(total);
		
	}

}
