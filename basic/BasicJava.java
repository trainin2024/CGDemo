package com.cg.basic;

public class BasicJava {

	public static void main(String[] args) {
	
		// Define two numbers
        int num1 = 5;
        int num2 = 10;
        // Add the numbers
        int sum = num1 + num2;
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        
     // Test which number is greater
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal");
        }
        
        
     // Use switch to determine the sign of the difference
        // Calculate the difference
        int diff = num1 - num2;
        switch (Integer.signum(diff)) {
            case -1:
                System.out.println(num2 + " is greater than " + num1);
                break;
            case 1:
                System.out.println(num1 + " is greater than " + num2);
                break;
            default:
                System.out.println("Both numbers are equal");
                break;
        }

        
     // Use ternary operator to determine which number is greater
        String result = num1 > num2 ? (num1 + " is greater than " + num2) :
                       (num1 < num2 ? (num2 + " is greater than " + num1) : "Both numbers are equal");

	}

}
