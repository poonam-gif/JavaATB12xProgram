package Tasks.InterviewPractise;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Swapping without third variable : ");
        swap(2,3);
        System.out.println();
        System.out.println("Swapping using third variable : ");
        swap1(5,7);
    }

    public static void swap(int a,int b){
        System.out.println("Before swapping - a : "+a+ " b : " +b );
        a= a+b;  // 2 +3 =5
        b= a-b;  // 5 -3 =2
        a= a-b;  // 5 -3 =3
        System.out.println("Before swapping - a : "+a+ " b : " +b );
    }

    public static void swap1(int a,int b){
        int temp;
        System.out.println("Before swapping - a : "+a+ " b : " +b );
       temp =a;   //  temp = 5
       a=b;       // a = 7
       b=temp;    // b =5
        System.out.println("Before swapping - a : "+a+ " b : " +b );
    }
}
