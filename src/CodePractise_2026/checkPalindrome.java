package CodePractise_2026;

public class checkPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("welcome"));
        System.out.println(isPalindrome("level"));
    }
    public static boolean isPalindrome(String s){

        String rev="";
        String original=s;
        System.out.println("Original String : "+original);

        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        System.out.println("Reversed String : "+rev);
        if(rev.equals(original)){
            return true;
        }else{
            return false;
        }
    }


}
