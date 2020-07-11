package week6_String;

import java.util.Scanner;

public class Question77_Email2 {

	public static void main(String[] args) {
		// olcay // Jul 7, 2020
		
		/*Write a program that will print out information about user based on email. Print first and last name from the upper case.

		Example:
		Input: craig_federighi@apple.com
		Output: 
		First name: Craig
		Last name: Federighi
		Domain: apple
		Top-Level Domain: com
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name:");
	    String email = scan.next();
	    
	    String nameUpper = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf('_'));	
	    
	    String surname=email.substring(email.indexOf('_')+1, email.indexOf('@'));	    
	    String surnameUpperCase=surname.substring(0, 1).toUpperCase() + surname.substring(1);
	 
	    
	    String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
	    
	    String TopLevelDomain = email.substring(email.indexOf('.')+1);
	    
	    System.out.println("First name: " + nameUpper);
	    System.out.println("Last name: " + surnameUpperCase);
	    System.out.println("Domain: " + domain);
	    System.out.println("Top-Level Domain: " + TopLevelDomain);
		
		
	}

}
