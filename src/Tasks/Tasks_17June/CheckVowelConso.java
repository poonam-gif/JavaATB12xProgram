package Tasks.Tasks_17June;

public class CheckVowelConso {
    public static void main(String[] args) {
        String s = "poonam";

        for (int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                System.out.println("The char* " +s.charAt(i)+ " * is Vowel");
            }else {
                System.out.println("The char* " +s.charAt(i)+ " * is Consonent");
            }
        }
    }
}
