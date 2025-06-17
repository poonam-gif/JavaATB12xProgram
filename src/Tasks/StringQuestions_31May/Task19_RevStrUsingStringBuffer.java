package Tasks.StringQuestions_31May;

public class Task19_RevStrUsingStringBuffer {
    public static void main(String[] args) {
        //String str ="poonam";

        StringBuffer sb = new StringBuffer("poonam");
        String original = sb.toString();

        String result = sb.reverse().toString();
        System.out.println(result);
    }
}
