package Tasks.HackerRank_25May;

public class Task9_LeapYearChecker {
    public static void main(String[] args) {
        int year = 2020;

        if((year % 4 ==0 && year %100 != 0 ) || (year %400==0)){
            System.out.println("The year : " +year + " is a leap year");
        }else{
            System.out.println("The" +year + " is Not a leap year");

        }
    }
}
//A year is a leap year if:
//
//It is divisible by 4 and not divisible by 100,
//OR
//
//It is divisible by 400