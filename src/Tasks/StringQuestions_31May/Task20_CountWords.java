package Tasks.StringQuestions_31May;

public class Task20_CountWords {
    public static void main(String[] args) {
        String str = "This  is a  new  String";

        //removing extra spaces from string
        String s = str.replaceAll("\\s+" , " ");
        System.out.println(s);
        if(s.isEmpty()){
            System.out.println("Word Count : 0");
        }else {
            String[] words = s.split(" ");
            int wordCount = words.length;
            System.out.println("Word Count : " + wordCount);
        }
    }
}
