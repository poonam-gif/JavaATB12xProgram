package Tasks.HackerRankArray_1stJune;

public class Task21_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,10};

        for(int i= arr.length-1 ; i >= 0; i--){
            System.out.printf("%d ", arr[i]);
        }

    }
}
