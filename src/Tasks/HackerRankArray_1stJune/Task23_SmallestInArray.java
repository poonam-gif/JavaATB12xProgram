package Tasks.HackerRankArray_1stJune;

public class Task23_SmallestInArray {
    public static void main(String[] args) {
        int[] a = {2,4,1,13,9,10};

        int min = a[0];

        for(int i =0 ;i<=a.length-1;i++){
            if(a[i] < min){
                min=a[i];
            }
        }
        System.out.println("smallest Element is " + min);

    }
}
