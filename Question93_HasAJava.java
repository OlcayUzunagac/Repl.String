package week6_String;

import java.util.Scanner;

public class Question93_HasAJava {

	public static void main(String[] args) {
		// olcay // Jul 8, 2020
		
	/*	Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
	  such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
	 */
				/*Example:
				input: javapython
				output: true

				Example:
				input: cjavac++
				output: true


				Example:
				input: c#javaruby
				output: false*/
		
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a word: ");
	    String word = scan.next();
	    
	    if(word.length()>3) {
	    	if(word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
	    	System.out.println(!exists);
	    	}else {
	    		System.out.println(exists);
	    	}
	    
	    }else {
	    	System.out.println(exists);
	    }
				
		
		
		
	}

}
