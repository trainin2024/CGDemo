package com.cg.basic.strings;

public class StringDemo {
    public static void main(String[] args) {
        // Create a string
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Concatenation
        String concatenated = str.concat(" How are you?");
        System.out.println("Concatenated string: " + concatenated);

        // Substring
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Character access
        char charAtIndex = str.charAt(4);
        System.out.println("Character at index 4: " + charAtIndex);

        // Case conversion
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // Comparison
        String str2 = "hello, world!";
        boolean isEqual = str.equals(str2);// Values
        System.out.println("String comparison (case sensitive): " + isEqual);
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str2);
        System.out.println("String comparison (case insensitive): " + isEqualIgnoreCase);

        // Search and replace
        String replaced = str.replace("World", "Universe");
        System.out.println("String after replacement: " + replaced);

        // Trimming
        String withSpaces = "  Hello, World!  ";
        String trimmed = withSpaces.trim();
        System.out.println("Trimmed string: " + trimmed);
    }
}
