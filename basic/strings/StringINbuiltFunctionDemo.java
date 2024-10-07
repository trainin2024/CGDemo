package com.cg.basic.strings;

public class StringINbuiltFunctionDemo {

	public static void main(String[] args) {
        String str = "Hello, World!";
        // 1. length() - Returns the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);	//13
        
        // 2. charAt() - Returns the character at the specified index
        char charAtIndex5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5); //,
        
        // 3. substring() - Returns a substring of the original string
        String substringFromIndex7 = str.substring(7);
        System.out.println("Substring from index 7: " + substringFromIndex7); //World!
        
        // 4. indexOf() - Returns the index of the first occurrence of a character or substring
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of comma: " + indexOfComma); //5
        
        // 5. contains() - Checks if the string contains a specified substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld); //true
        
        // 6. toUpperCase() - Converts the string to uppercase
        String upperCaseString = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString); //HELLO, WORLD!
        
        // 7. toLowerCase() - Converts the string to lowercase
        String lowerCaseString = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString); //hello, world!
        
        // 8. replace() - Replaces occurrences of a specified substring with another substring
        String replacedString = str.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replacedString); // Hi, World!
        
        // 9. trim() - Removes leading and trailing whitespaces
        String stringWithWhitespace = "   Trim Me   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Original string with whitespace: '" + stringWithWhitespace + "'"); //'   Trim Me   '
        System.out.println("Trimmed string: '" + trimmedString + "'");//'Trim Me
        
        // 10. split() - Splits the string into an array of substrings based on a delimiter
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
	}

}
