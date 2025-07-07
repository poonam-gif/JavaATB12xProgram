package Tasks.InterviewPractise;

public class variables {
    public static void main(String[] args) {
       // System.out.println(number);
        variables v = new variables();
       int n = v.myname();
        System.out.println(n);

    }
    int myname(){
       //1. static String name;   /// we cannot create static var inside  block

            int number =10;  //this is the local variable ,we can only access it locally
        return number;
    }
}
