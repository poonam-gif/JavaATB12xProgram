package Tasks.Task2TernaryOperators;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a number: ");


        int number = scanner.nextInt();  // Read the user input

        // Use the ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println( "The provided number is " + result + ".");

        scanner.close();

        //checking evenodd by providing n value
        evenOddCheck();
    }

    public static void evenOddCheck(){
        int n= 24;

        String res = (n %2 ==0) ? "Even" : "Odd";
        System.out.println( +n+"The number is " + res + ".");
    }
}
