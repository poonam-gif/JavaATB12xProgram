package Assesments.FirstTest_21June;

public class Q5_OperatorPrecedenceCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        double result = a + b * 2;
        System.out.println("Expression result: " + (int)result);

        double implicitCast = a + b;
        System.out.println("Implicit casting: " + implicitCast);

        int explicitCast = (int)(a + b);
        System.out.println("Explicit casting: " + explicitCast);
    }
}


//Output:
//Expression result: 23 Implicit casting: 13.5 Explicit casting: 13