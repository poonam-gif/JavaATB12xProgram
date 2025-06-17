package Tasks.StringQuestions_31May;

public class Task18_ReverseStringUsingLoop {
    public static void main(String[] args) {
        String s = "SoftwareTest";
        String rev = "";
        for(int i=0;i<s.length();i++){
            rev= s.charAt(i) +rev;
        }
        System.out.println( "reversed String is " +rev);

        palindrome();
    }

    public static void palindrome(){
        StringBuffer sb = new StringBuffer("level");
        String original = sb.toString();
        String reversed = sb.reverse().toString();

        if(original.equals(reversed)){
            System.out.println("String : " +original+ " is Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
