package CollectionPractise.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> originalnum = new ArrayList<>();
        originalnum.addAll(Arrays.asList(2,4,6,3,2,6,7,9,0,1));

        List<Integer> uniqnumber = new ArrayList<>();

        //sort in asc
        Collections.sort(originalnum);

        System.out.println(originalnum);

        //remove duplicates

        for(int number : originalnum){
            if(!uniqnumber.contains(number)){
                uniqnumber.add(number);
            }
        }

        System.out.println("Original: " + originalnum);
        System.out.println("Without Duplicates: " + uniqnumber);

       removeDuplicateNum();

        hello();
    }


    public static void removeDuplicateNum() {
        int[] num = {2, 3, 1, 4, 2,2, 6, 4, 7};

        for (int i = 0; i <= num.length - 1; i++) {
            boolean found = false;
            int count =1;
            for (int j = i + 1; j <= num.length - 1; j++) {
                if (num[i] == num[j]) {
                    found = true;
                    count =count+1;
                }
            }

            if (count>1) {
                System.out.println("The count of repeated number  :" +num[i]+ " is " +count);
            }
        }
    }


   public static void hello() {
        int array[] = {4,5,5,5,3,2,4,1,2,6};
        int count;
        boolean visited[] = new boolean[array.length];
        for(int i=0;i<array.length;i++){
            if(visited[i]){
                continue;
            }
            count =1;
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count =count+1;
                    visited[j] = true; // Mark as visited
                }
            }
            if(count>1){
                System.out.println("The count of repeated number : "+array[i]+ "is" +count);

            }
        }
    }
}
