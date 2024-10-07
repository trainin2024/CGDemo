package com.cg.basic;

public class LoopForeach {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5}; //Declared the array and we initialize it 

        // Print array elements using for-each loop
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Declare an array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};

        // Print array elements using for-each loop
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Declare an array of characters
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Print array elements using for-each loop
        System.out.println("\nVowels:");
        for (char vowel : vowels) {
            System.out.print(vowel + " ");
        }
        System.out.println();
    }
}