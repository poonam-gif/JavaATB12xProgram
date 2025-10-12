package Tasks.Task_18June_CoreJava;

public class For_SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int sum =0;
        // Loop from 1 to 10 (natural numbers)
        for(int i=1;i<=10;i++){
            sum=sum+i;

        }
        // Print the result
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }

}
