package week6_String;

public class Question203_Palindrome {

	public static void main(String[] args) {
		// olcay // Jul 9, 2020
		
	/*	Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

		So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

		- make your conditions case insensitive.  ex: Civic and civic are both palindromes
		- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

		Examples:

		isPalindrome("Noon") ==> true

		isPalindrome("I am not palindrome") ==> false

		isPalindrome("wooden") ==> false

		isPalindrome("Nurses Run") ==> true
		*/
		System.out.println(isPalindrome("Nurses Run"));
	}
	
	public static boolean isPalindrome(String check) {
		
		String check1="";
		for(int i=check.length()-1; i>=0; i--) {
			check1= check1 + check.charAt(i);
		}
		
		if(check.replace(" ", "").equalsIgnoreCase(check1.replace(" ", ""))) {
			return true;
		}
		return false;
	}

}
