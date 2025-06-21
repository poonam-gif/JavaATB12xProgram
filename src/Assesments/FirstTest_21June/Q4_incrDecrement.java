package Assesments.FirstTest_21June;

public class Q4_incrDecrement {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: " + i);

        int preInc = ++i;
        System.out.println("Pre-increment: " + preInc);

        int postInc = i++;
        System.out.println("Post-increment: " + i + " (returned " + postInc + ")");

        int preDec = --i;
        System.out.println("Pre-decrement: " + preDec);

        int postDec = i--;
        System.out.println("Post-decrement: " + i + " (returned " + postDec + ")");
    }
}

//Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)