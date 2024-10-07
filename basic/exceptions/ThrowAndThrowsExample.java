package com.cg.basic.exceptions;

import java.io.IOException;

public class ThrowAndThrowsExample {

	//throw - throwing an exception object. Can throw only one exception object
	//throws - it is decalaration given with method signature. I can specify more than one exception 
	
    // Method using throw keyword to manually throw an exception
    public static void checkAge(int age) throws ArithmeticException , RuntimeException{
        if (age < 18) {
            throw new ArithmeticException("Underage person cannot be processed!");
        } else {
            System.out.println("Age is valid.");
        }
        
        if (age >50) {
            throw new RuntimeException("Overage!");
        } else {
            System.out.println("Age is valid.");
        }
    }

    // Method using throws keyword to declare an exception
    public static void readFile() throws IOException {
        // Simulating an IOException by throwing it
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            // Demonstrating throw keyword
            checkAge(-140); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            
        }
        try {
            // Demonstrating throws keyword
            readFile(); // This will throw an exception
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
