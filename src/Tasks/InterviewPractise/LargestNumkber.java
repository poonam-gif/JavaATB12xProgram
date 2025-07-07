package Tasks.InterviewPractise;

public class LargestNumkber {
    public static void main(String[] args) {
        Largest();

        SecondHighest();

        SecondLargestSort();
    }

    public static void Largest() {
        int[] arr = {3, 5, 2, 8, 1, 9, 6, 11};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("highest is :" + max);
    }

    public static void SecondHighest() {
        int[] arr = {3, 5, 2, 8, 1, 9, 6, 11};

        int highest = arr[0];
        int secondHighest = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > highest) {   // 5>3 yes
                secondHighest = highest;     // 5
                highest = arr[i];       // 3

            } else if (arr[i] > secondHighest && arr[i] != highest) { //11>0 &11!=20, 45>20 & 45 !=45 false ,77>45 &77 =77false,88>77 & 88 !=90
                secondHighest = arr[i];
            }
        }
        System.out.println("the second highest is :" + secondHighest);
    }


    public static void SecondLargestSort() {
        int[] arr = {3, 5, 2, 8, 1, 9, 6, 11};

        int secondLargest ;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.println(arr[i]);

        }
        secondLargest =  arr[arr.length-2];
        System.out.println("second large using sort is : "+ secondLargest);
    }
}





