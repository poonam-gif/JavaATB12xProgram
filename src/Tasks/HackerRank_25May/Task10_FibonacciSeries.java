package Tasks.HackerRank_25May;

public class Task10_FibonacciSeries {
    public static void main(String[] args) {
        int n = 8; // wehave to print fibonnaci series till first n numbers
        int n1 = 0;
        int n2 = 1;
        int n3 ;
        System.out.println("Fibonacci series of n%d numbers are :");
        System.out.print(n1+ "," +n2+",");

        for(int i =2;i<=n;i++){
           n3 = n1+n2 ;   // 1 //1+1 =2  //2+1 =3   //2+3 =5
            System.out.print(n3+ ",");
            n1 = n2 ;   //  1  // 1  // 2
            n2 = n3 ;   // 1  //2   // 3
        }
    }
}
