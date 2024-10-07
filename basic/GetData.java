package com.cg.basic;
import java.util.Scanner;
public class GetData {
	    public static void main(String[] args) {
	    	
	    	System.out.println(" Arguments : "+ args[0]+"   " + args[1]);
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Accept input of different types
	        System.out.print("Enter an integer: ");
	        int intValue = scanner.nextInt(); 

	        System.out.print("Enter a double: ");
	        double doubleValue = scanner.nextDouble();

	        System.out.print("Enter a string: ");
	        String stringValue = scanner.next();

	        // Display the input values
	        System.out.println("Integer entered: " + intValue);
	        System.out.println("Double entered: " + doubleValue);
	        System.out.println("String entered: " + stringValue);

	        // Close the scanner
	        scanner.close();
	    }
	}


