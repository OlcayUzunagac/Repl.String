package week6_String;

import java.util.Scanner;

public class Question95_PrintLetters {

	public static void main(String[] args) {
		// olcay // Jul 8, 2020
		
	/*	Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars. 
		Example:
		input: A
		input: Z
		output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

		Example:
		input: a
		input: f
		output: abcdef

		Example:
		input: a
		input: d
		output: abcd

		Example:
		input: B
		input: O
		output: BCDEFGHIJKLMNO
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start letter: ");
		char start = scan.next().charAt(0);
		System.out.println("Enter the end letter: "); 
		char end = scan.next().charAt(0);
		
	    
		String dummy="";
	    for(char c=start; c<=end; c++ ) {
	    	
	    	
	    	dummy=dummy+c;
	    }
	   
	    
	    System.out.println(dummy);
	    
	    
	}

}
