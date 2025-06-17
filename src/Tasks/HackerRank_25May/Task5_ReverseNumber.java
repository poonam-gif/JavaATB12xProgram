package Tasks.HackerRank_25May;

public class Task5_ReverseNumber {
    public static void main(String[] args) {
        int n =12345;
        int rev = 0;
        int reminder;
        System.out.println("original number is: " + n);

        while(n != 0){
            reminder = n % 10;              //first reminder is 5 // 4  //3
            rev = reminder + rev *10;       // 5 +0*10 =5     // 4 +50 =54 // 3 + 540=543
            n = n/10;                       // n = 1234  //123 //12
        }
        System.out.println("reversed number is: " + rev);
    }

}
