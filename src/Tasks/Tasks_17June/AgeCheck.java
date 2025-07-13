package Tasks.Tasks_17June;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask for name and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Logic: Check eligibility
        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote. ");
        } else {
            System.out.println(name + ", you are NOT eligible to vote. ");
        }

        scanner.close();
    }
}
