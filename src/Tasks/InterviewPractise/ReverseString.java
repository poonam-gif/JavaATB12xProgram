package Tasks.InterviewPractise;

public class ReverseString {
    public static void main(String[] args) {

        String s = "Poonam";
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;

        }
        System.out.println("Reversed String :" + rev);

        RevesrWithDecrement("level", "");
        revTrim();
    }

    public static void RevesrWithDecrement(String s, String reverse) {

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void revTrim() {
        String name = " my name is poonam";

        //trim to remove leading whitespace
        System.out.println("string after spce is removed : " + name.trim());

        //Remove extra whuitespace
        //System.out.println("String after removing extra space : "+name.replaceAll("\\s",""));

        //reverse whole word

        String word = name.trim();
        String[] splited = word.split(" ");
        String reversed ="";


        for (int i =  splited.length-1;i>=0 ;i--) {

            reversed=splited[i];
            System.out.print(" "+reversed);
        }


    }
}

