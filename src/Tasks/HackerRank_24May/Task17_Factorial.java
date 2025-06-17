package Tasks.HackerRank_24May;

import java.util.Scanner;

public class Task17_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 to " + Integer.MAX_VALUE + "): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        if (n > 20) {  //21! is greater than Long.MAX_VALUE
            System.out.println("Number is too large. Factorial may overflow 'long' type.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial =factorial* i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }

}
