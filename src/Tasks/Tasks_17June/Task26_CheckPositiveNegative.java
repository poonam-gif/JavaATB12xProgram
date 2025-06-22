package Tasks.Tasks_17June;

import java.util.Scanner;

public class Task26_CheckPositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num+ ": Its a negative number");
        } else{
            System.out.println(num+ ":number is Positive");
        }
    }
    }

