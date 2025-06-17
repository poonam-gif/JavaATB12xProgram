package Tasks.HackerRank_25May;

import java.util.Scanner;

public class Task15_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Grade : ");
        int score = sc.nextInt();

        if(score < 0 && score > 100){
            System.out.println("Invalid Score..");
        } else if (score >=90 ) {
            System.out.println("Grade : A");
        } else if( score >= 80 && score < 90){
            System.out.println("Grade : B");

        }else if( score >= 70 && score < 80){
            System.out.println("Grade : C");

        }else if( score >= 60 && score < 70){
            System.out.println("Grade : D");

        }else{
            System.out.println("Grade : F");
        }

            
        }
    }




//Write a program that calculates and displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59