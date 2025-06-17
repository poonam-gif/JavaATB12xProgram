package Tasks.HackerRankArray_1stJune;

public class Task24_SumOfArray {
    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 3, 2};
        int sum = 0;

        if (arr.length == 0) {
            System.out.println("Array is Empty");

        } else {
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];    //
            }
            System.out.println("Sum of the Array Elements :" + sum);

        }
    }
}