package Assesments.FirstTest_21June;

import java.util.Scanner;

public class Q6_positiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(num + ": is 0");
        } else if (num < 0) {
            System.out.println(num + ": Its a negative number");
        } else {
            System.out.println(num + ":number is Positive");
        }
    }
}
