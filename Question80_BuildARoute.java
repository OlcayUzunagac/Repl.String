package week6_String;

import java.util.Scanner;

public class Question80_BuildARoute {

	public static void main(String[] args) {
		// olcay // Jul 7, 2020
		
		
		/*Write a program that will print out route instructions. 
		 Your program should take 2 parameters: start point and endpoint. 
		 Use left, right, up and down for navigation. Insert ">" between commands. 
		 If start point equals to endpoint - display: "start/end(start or end variable!) found".
		Note: you may move only clockwise.

		Example:
		Input: A
		Input: D
		Output: right > down > left: D found

		Input: C
		Input: C
		Output: C found
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter start point: ");
	    String start = scan.next();
	    System.out.print("Enter end point: ");
	    String end = scan.next();
	    		
	    if(start.equals(end)) {
	    	System.out.println(end + "found");
	    }else {
	    	if(start.equals("A")) {
	    		if(end.equals("B")) {
	    			System.out.println("right: " + end + " found");
	    		}else if(end.equals("C")) {
	    			System.out.println("right > down: " + end + " found");
	    		}else if(end.equals("D")) {
	    			System.out.println("right > down > left: " + end + " found");
	    		}
	    	}else if(start.equals("B")) {
	    		if(end.equals("C")) {
	    			System.out.println("down: " + end + " found");
	    		}else if(end.equals("D")) {
	    			System.out.println("down > left: " + end + " found");
	    		}else if(end.equals("A")) {
	    			System.out.println("down > left > up: " + end + " found");
	    		}
	    	}if(start.equals("C")) {
	    		if(end.equals("D")) {
	    			System.out.println("left: " + end + " found");
	    		}else if(end.equals("A")) {
	    			System.out.println("left > up: " + end + " found");
	    		}else if(end.equals("B")) {
	    			System.out.println("left > up > right: " + end + " found");
	    		}
	    	}if(start.equals("D")) {
	    		if(end.equals("A")) {
	    			System.out.println("up: " + end + " found");
	    		}else if(end.equals("B")) {
	    			System.out.println("up > right: " + end + " found");
	    		}else if(end.equals("C")) {
	    			System.out.println("up > right > down: " + end + " found");
	    		}
	    	}
	    	
	    
	    }
		
	}

}
