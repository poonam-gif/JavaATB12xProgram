package Tasks.InterviewPractise;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        primeNumber(40);
        boolean result = isPrime(13);
        System.out.println( "is prime ? " +result);
    }

    static boolean isPrime(int n) {

        if (n % 2 == 0 && n>2) {
            return false;
        }

        return true;
    }


    public static void primeNumber(int num) {

        int count = 0;
        for(int i = 1; i<=num;i++) {
            if(num%i == 0) {
                count =count+1;
            }
        }
        if(count<=2 ) {
            System.out.println("prime");
        }else {
            System.out.println("Not prime");

        }

    }

}
