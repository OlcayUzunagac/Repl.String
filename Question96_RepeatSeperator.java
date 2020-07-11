package week6_String;

import java.util.Scanner;

public class Question96_RepeatSeperator {

	public static void main(String[] args) {
		// olcay // Jul 8, 2020
		
	/*	Given two strings, word and a separator sep, 
	 return a big string made of count occurrences of the word, separated by the separator string.
				
				Example:
				input: Word
				input: X
				input: 3
				output: WordXWordXWord

				Example:
				input: This
				input: And
				input: 2
				output: ThisAndThis

				Example:
				input: This
				input: And
				input: 1
				output: This
				*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String , seperator and a number: ");
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	   
	    
	    int count1=0;
	    boolean flag=false;
	    
	    do {
	    	
	    	if(flag) {
	    		System.out.print(separator);
	    	}
	    	
	    	System.out.print(word);
	    	
	    	count1++;
	    	
	    	flag = true;
	    	
	    }while(count1<count);
	 
	}

}
