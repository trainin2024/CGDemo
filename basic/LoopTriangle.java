package com.cg.basic;

public class LoopTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop to print asterisks
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
