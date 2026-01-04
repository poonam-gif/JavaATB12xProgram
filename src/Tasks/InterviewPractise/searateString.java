package Tasks.InterviewPractise;

public class searateString {
    public static void main(String[] args) {
        String s="Cyba234ge76#$%(" ;
        StringBuilder alhabets=new StringBuilder();
        StringBuilder digits=new StringBuilder();
        StringBuilder scl = new StringBuilder();

        for (char ch : s.toCharArray()){
            if (Character.isDigit(ch)){
                digits.append(ch);

            } else if (Character.isLetter(ch)) {
                alhabets.append(ch);
            }else {
                scl.append(ch);
            }
        }

        System.out.println("Alphabets:" +alhabets);
        System.out.println("Digits:" +digits);
        System.out.println("Special chars:" +scl);
    }
}
