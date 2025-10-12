package Tasks.Task_18June_CoreJava;
//Print even numbers from 1 to 20
public class For_PrintEvenNumbers1To20 {
    public static void main(String[] args) {
        System.out.println("Printing even numbers from 1-10");
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
