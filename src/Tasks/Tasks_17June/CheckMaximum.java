package Tasks.Tasks_17June;

import java.util.Scanner;

public class CheckMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(n1+ " is Maximum number");
        }else{
            System.out.println(n2+ " is maximumnumber");
        }

    }
}
