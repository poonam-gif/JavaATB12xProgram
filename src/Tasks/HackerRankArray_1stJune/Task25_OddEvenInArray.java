package Tasks.HackerRankArray_1stJune;

public class Task25_OddEvenInArray {
    public static void main(String[] args) {

        int[] a = {3,6,12,15,4,14,7,9};

        for(int i=0;i<a.length;i++){
            if(a[i]%2 ==0){
                System.out.println(a[i]+ " : is even number");
            }else{
                System.out.println( +a[i]+ " : is ODD number");

            }   //
        }

    }
}
