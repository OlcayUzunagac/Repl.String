package week6_String;

public class Question179_unique {

	public static void main(String[] args) {
		// olcay // Jul 9, 2020
		
	/*	uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

				Examples:

				uniqueChars("java") ==> "jav"

				uniqueChars("mama") ==> "ma"

				uniqueChars("spoon") ==> "spon"
				
				*/
		System.out.println( uniqueChars("spoooon") ) ;
		
	} 


	public static String uniqueChars(String str) {
		
		String unique="";
		
		for(int i=0; i<str.length(); i++) {
				
				if(unique.indexOf(str.charAt(i)) == -1) {
					
					unique+=str.charAt(i);
				}
		}

		return unique;
		
	}	
}
