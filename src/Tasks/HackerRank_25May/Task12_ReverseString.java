package Tasks.HackerRank_25May;

public class Task12_ReverseString {
    public static void main(String[] args) {
        String s = "TestingAcademy";
        String rev ="";

        for(int i=0 ; i<s.length();i++){
            rev = s.charAt(i) + rev ;     // T +"= T // e +T =eT   // s_et =set .....
        }
        System.out.println("Reversed String is :" + rev);
    }
}
