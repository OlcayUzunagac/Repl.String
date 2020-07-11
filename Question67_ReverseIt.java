package week6_String;

import java.util.Scanner;

public class Question67_ReverseIt {

	public static void main(String[] args) {
		// olcay // Jul 6, 2020
		/*Write a program that will reverse a string. 
		 * Your program should reverse a string only 5 characters long. 
		 * If word is shorter, display message: "Too short!". If word is longer,
		 *  display message: "Too long!". Otherwise, reverse this word and print out result into the console. 

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a word with 5 character:");
	    String word = scan.next();
	    
	    if(word.length()<5) {
	    	System.out.println("Too short");
	    }else if(word.length()>5) {
	    	System.out.println("Too long");
	    }else {
	    	for(int i=word.length()-1;i>=0;i--)
	    	System.out.print(word.charAt(i));
	    }

		
		
		
		
	}

}
