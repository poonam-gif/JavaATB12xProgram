package Assesments.Test_28June_String;

public class StringOperations {
    public static void main(String[] args) {
        String s = "Hello World";

        // Concatenation
        String concatenated = s + "!";

        // Length
        int length = s.length();

        char firstChar = s.charAt(0);

        // Substring (extract "World")
        String substring = s.substring(6);

        // Output results
        System.out.println("Original: " + s);
        System.out.println("Concatenated: " + concatenated);
        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + substring);
    }

}

