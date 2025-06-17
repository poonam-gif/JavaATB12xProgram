package Tasks.HackerRankArray_1stJune;

public class Task22_LargestInArray {
    public static void main(String[] args) {
        int[] a = {2,4,7,13,9,10};

        int max = a[0];

        for(int i =0 ;i<=a.length-1;i++){
            if(a[i] > max){
                max=a[i];
            }
        }
        System.out.println("Largest Element is " + max);
    }

}
