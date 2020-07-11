package week6_String;

public class Question183_LimitString {

	public static void main(String[] args) {
		// olcay // Jul 9, 2020
		
	/*	This method gets a string and an int, it returns a string.

		what it dose is limit the inputted string to a cretin number of characters.

		for example:

		limit("abcd",2)
		returns "ab"

		limit("bla bla",3)
		returns "bla"
		*/
		System.out.println(limit("abcd", 2));
		
	}
	
	public static String limit(String text, int maxLength) {
		
		
		return text = text.substring(0, maxLength);
	}

}
