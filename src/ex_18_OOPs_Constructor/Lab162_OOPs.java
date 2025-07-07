package ex_18_OOPs_Constructor;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b2 = new Baby();
        Baby b3 =new Baby();
//here we can see any number of objects we are creating ,it is calling the default constructor everytime,as we see we have created 2 obj then baby called 2 times.
    }

}

//
class Baby{
    String name;

     Baby() {
       //this is called automatically when object is created as its default constructor.
         System.out.println("Baby is called by default");
    }
}
