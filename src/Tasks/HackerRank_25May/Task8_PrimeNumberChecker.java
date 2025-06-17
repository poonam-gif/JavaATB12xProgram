package Tasks.HackerRank_25May;

// 1is not prime number
//A prime number is a number that:
//Is greater than 1
//Has exactly two distinct positive divisors: 1 and itself

public class Task8_PrimeNumberChecker {
    public static void main(String[] args) {
        int num = 1;
        int isPrime = 1;    // 1 = true , 0 = false

        if(num<=1){
            isPrime = 0 ;
        }else{
            for(int i=2; i <= num; i++){
                if(num%i==0){
                    isPrime = 1;
                }
            }
        }

        if(isPrime == 1){
            System.out.println(num+" :The given number is Prime number");
        }else{
            System.out.println(num+" :The number is not prime number");
        }
    }
}
