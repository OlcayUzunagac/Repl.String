package week6_String;

import java.util.Scanner;

public class Question97_CountJava {

	public static void main(String[] args) {
		// olcay // Jul 8, 2020
		
		/*Return the number of times that the string "java" appears anywhere in the given string word.

		Example:
		input: javaxjava
		output: 2

		Example:
		input: javaxjavaapplepearjavaegg
		output: 3
		*/
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    
	    int count=0;
	    
	    for(int i=0; i<word.length()-3; i++) {
	    	
	    	if(word.subSequence(i, i+4).equals("java")) {
	    		count++;
	    	}
	    	
	    }
		System.out.println(count);
		
		
	}

}
