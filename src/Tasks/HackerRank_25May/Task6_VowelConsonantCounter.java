package Tasks.HackerRank_25May;

public class Task6_VowelConsonantCounter {
    public static void main(String[] args) {
        String s = "countConsonants" ;//a,e,i,o,u

        int countvowel =0;
        int countConsonants =0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                countvowel = countvowel +1;
            }else {
                countConsonants = countConsonants+1;
            }
        }
        if(countvowel > 0 && countConsonants > 0 ){
            System.out.println("The count of vowels :" +countvowel + " /n and Consonants :" + countConsonants);
        } else{

            System.out.println("No vowels and consonants present in the string");

        }
    }

}
