package CodePractise_2026;
import java.util.*;
public class swapping {
    public static void main(String[] args) {
        System.out.println("Swapping Using Third variable : ");
        swapUsingThirdVar();
        System.out.println("Swapping without Third variable : ");
        swapWithoutThirdVar();
        System.out.println("__________________________________________");
        findDuplicate("helloo");
        System.out.println("__________________________________________");

        countWords("poonam");

    }

    //code 4: Swap the Numbers
    public static void swapUsingThirdVar(){

        int a= 10,b=20,temp;
        System.out.println("Before Swapping: a = "+a+ "b= "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: a = "+a+ "b= "+b);

    }

    public static void swapWithoutThirdVar(){

        int a= 1,b=2;
        System.out.println("Before Swapping: a = "+a+ " b= "+b);
        a=a+b;  //3
        b=a-b;  //3-2 = 1
        a=a-b;  // 3-1 =2
        System.out.println("After Swapping: a = "+a+ " b= "+b);

    }

    public static void findDuplicate(String s){

        char[] chars = s.toCharArray();

        for(int i=0; i<=s.length()-1; i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(chars[i]==chars[j]){
                    count = count+1;
                }
            }
            if(count>1){
                System.out.println("Duplicate : " +chars[i]);
            }
        }
    }


    public static void countWords(String s){
        char[] chars=s.toCharArray();
        HashMap<Character ,Integer> hm =new LinkedHashMap<>();
        for(char ch : chars){
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                int value = hm.get(ch);
                hm.put(ch,value+1);
            }
        }
        System.out.println(hm);
    }


    //[2,5,1,6,7] swap as per ascending order


}

