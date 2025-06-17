package Tasks.HackerRank_25May;

public class Task7_PalindromeChecker {
    public static void main(String[] args) {
        String name = "levele";
        String rev="";
        String original=name;

        for(int i=0;i<=name.length()-1;i++)
        {
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);
        if(original.equalsIgnoreCase(rev))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrom");
        }
    }

}
