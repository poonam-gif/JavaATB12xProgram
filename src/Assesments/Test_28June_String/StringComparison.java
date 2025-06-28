package Assesments.Test_28June_String;

public class StringComparison {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // == operator to cmpare referneces
        boolean isEqualReference = (string1 == string3);

        // equals() (case-sensitive  comparison)
        boolean isEqualContent = string1.equals(string2);

        // equalsIgnoreCase() (case-insensitive comparison)
        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2);

        // compareTo()
        int compareToResult = string1.compareTo(string2);

        // Output results
        System.out.println("Using == operator: " + isEqualReference);
        System.out.println("Using equals(): " + isEqualContent);
        System.out.println("Using equalsIgnoreCase(): " + isEqualIgnoreCase);
        System.out.println("Using compareTo(): " + compareToResult);
    }

}

