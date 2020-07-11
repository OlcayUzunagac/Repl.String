package week6_String;

import java.util.Scanner;

public class Question79_WithoutX_x {

	public static void main(String[] args) {
		// olcay // Jul 7, 2020
		
		/*Given a string word, if the first or last chars are 'x' or 'X', print the string 
		 * without those 'x' or 'X' chars,  otherwise print the string unchanged. 

		Example: 
		input: xHiX 
		output: Hi

		Example:
		input: apple 
		output: apple

		input: xUxL
		output: UxL

		input: JavaX
		output: Java
		*/
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter word: ");
		 String word = scan.next();
		 
		
		 
		 if(!word.substring(0, 1).equalsIgnoreCase("x") && !word.substring(word.length()-1).equalsIgnoreCase("x")) {
			 System.out.println(word);
		 }else {
			
			System.out.println(word.replace("x", "").replace("X", ""));
		
		 }
	}

}
