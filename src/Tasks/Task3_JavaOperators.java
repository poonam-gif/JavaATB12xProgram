package Tasks;

public class Task3_JavaOperators {
    public static void main(String[] args) {
        operatorTask1();   //24
        operatorTask2();   // a= 13 , b=24 , c=103
        operatorTask3();   // i =0 ,j =1,k=2,m=-4
    }

    public static void operatorTask1() {
        int i = 11;

        i = i++ + ++i;

        System.out.println("The pre and postIncr operator Task 1= " + i);
    }

    public static void operatorTask2() {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("Incr/decr operators Task 2 : ");


        System.out.println("a= " + a);

        System.out.println("b=  " + b);

        System.out.println("c= " + c);
    }

    public static void operatorTask3() {

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("Incr/decr operators Task 3 : ");
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
