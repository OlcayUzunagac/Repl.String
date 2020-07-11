package week6_String;

public class Question182_CleanString {

	public static void main(String[] args) {
		// olcay // Jul 9, 2020
		
		/*This method gets two strings (text and badWord)  and returns a string.

		basicly what it dose is take out all the occurrences of badWord in text.

		for example:

		clean ("one two three","two")
		returns "one three"

		clean ("foo bar","foo")
		returns "bar"

		clean ("he said bla bla bla","bla")
		returns "he said "
		
		*/
		
		System.out.println(clean("he said bla bla bla", "bla"));
		
	}
	
	public static String clean (String text ,String badWord) {
		
		return text = text.replace(badWord, "");
		
	}

}
