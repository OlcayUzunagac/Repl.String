package week6_String;

import java.util.Scanner;

public class Question69_PrintHalfTwice {

	public static void main(String[] args) {
		// olcay // Jul 6, 2020
		
		/*Write a program that will print out first half of the word twice. 

		Example:

		input: java
		output: jaja
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("write a word");
	    String word = scan.next();
	    
	    System.out.println(word.substring(0, word.length()/2)+word.substring(0, word.length()/2));
		
		
	}

}
