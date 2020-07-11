package week6_String;

import java.util.Scanner;

public class Question76_Email1 {

	public static void main(String[] args) {
		// olcay // Jul 6, 2020
		
	/*	In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything. 

		Example:
		input: mike_tyson@gmail.com
		output: tyson_mike@gmail.com

		Example:
		input: barakobama@gmail.com
		output: barakobama@gmail.com
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("email:");
	    String email = scan.next();
	    
	    if(email.contains("_")) {
	    	
	    String name = email.substring(0, email.indexOf('_'));
	    
	    String surname = email.substring(email.indexOf('_')+1, email.indexOf('@'));
	    
	    System.out.println(surname + "_" + name + "@gmail.com");
	    
	    }else {
	    	
	    	System.out.println(email);
	    	
	    }
	    	
	}
		
}
