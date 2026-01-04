package CodePractise_2026;

public class StringReverse_01 {
    public static void main(String[] args) {
        reverseString("poonam");
        reverseSentence("hello I am here");

    }
    public static void reverseString(String s){

        String rev="";
        String original=s;

        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        System.out.println("Reversed String : "+rev);
    }

    public static void reverseSentence(String str){

        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--){

            System.out.print(words[i]+" ");
        }
    }

}
