package Tasks.Task2TernaryOperators;

public class MaximumOfThree {
    public static void main(String[] args) {
        int n1= 10, n2 = 65 ,n3=3;

        int max  = (n1 > n2)
                ? (n1 > n3 ? n1 : n3)
                : (n2 > n3 ? n2 : n3);

        System.out.println("The maximum number is: " + max);
    }

}
