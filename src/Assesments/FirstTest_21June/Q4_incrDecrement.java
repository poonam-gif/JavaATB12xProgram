package Assesments.FirstTest_21June;

public class Q4_incrDecrement {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: " + i);

        int preInc = ++i;
        System.out.println("Pre-increment: " + preInc); //6

        int postInc = i++;
        System.out.println("Post-increment: " + i + " (returned " + postInc + ")"); //6  --7

        int preDec = --i;
        System.out.println("Pre-decrement: " + preDec);  //6

        int postDec = i--;
        System.out.println("Post-decrement: " + i + " (returned " + postDec + ")");//5
    }
}

//Original: 5
// Pre-increment: 6
// Post-increment: 6 (returned 6)
// Pre-decrement: 5
// Post-decrement: 5 (returned 5)