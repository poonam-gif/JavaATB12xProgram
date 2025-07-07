package Tasks.InterviewPractise;

public class VowelString {
    public static void main(String[] args) {
        VowelString vs = new VowelString();
       boolean result = vs.hasVowel("pune");
        System.out.println("Has vowel? " +result);
    }

    boolean hasVowel(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch =='u'){
                return true;
            }
        }
        //if no vowels
        return false;
    }

}
