package week6_String;

public class Question184_at3rdChar {

	public static void main(String[] args) {
		// olcay // Jul 9, 2020
		
		/*at3 gets two strings and returns a string.

		the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

		example use:

		at3("longword","foo")
		will return: "lonfoogword"

		at3("blabla","a")
		will return: "blaabla"
		*/
		System.out.println(at3("longword", "foo"));
	}
	
	public static String at3(String target,String word) {
		
		return target = target.substring(0, 3).concat(word) + target.substring(3);
		
		
	}

}
