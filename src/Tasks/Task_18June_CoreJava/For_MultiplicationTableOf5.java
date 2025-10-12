package Tasks.Task_18June_CoreJava;
//Print multiplication table of 5
public class For_MultiplicationTableOf5 {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("Multiplication Table of " + number + ":");
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d * %d =%d \n ", number,i,result);
        }
    }
}
