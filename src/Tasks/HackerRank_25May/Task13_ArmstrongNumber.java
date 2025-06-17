package Tasks.HackerRank_25May;

import java.util.Scanner;

public class Task13_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reminder ;
        int temp = 0;
        int original_num =n;

        while (n != 0) {
            reminder = n %10;
            temp = temp + (reminder*reminder*reminder);
            n = n/10;
        }
        if (original_num == temp){
        System.out.println("The number " +original_num+ " is an armstrong number");
        }else {
            System.out.println("not an armstrong number");
        }
    }
}
