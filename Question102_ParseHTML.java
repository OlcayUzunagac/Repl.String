package week6_String;

import java.util.Scanner;

public class Question102_ParseHTML {

	public static void main(String[] args) {
		// olcay // Jul 8, 2020
		
		/*Write a program, that will read html variable and output attribute value of id attribute (tag) into the console. 
		Input will be provided in a single line as outlined below. If html variable doesn't contain <html> attribute, 
		print out into the console message: "Invalid input!". 

		Example: 
		input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
		output: myid
		*/
		
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    
	    int first=0;
		int last=0;
	    
	    if(!html.contains("<html>")) {
	    	System.out.println("Invalid input!");
	    }else {
	    	for(int i=0; i<html.length()-1; i++) {
	    		first= html.indexOf("id=");
	    		last = html.lastIndexOf('"');
	    		}
	    	System.out.println(html.substring(first+4, last));
	    	}
		
	}

}
