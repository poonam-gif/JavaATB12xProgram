package ex_02_JavaBasics_Part2;

public class Lab026_LocalVariables {

    //local variable are the variables which defined inside the block method or function
    //cannot be accessed outside the block
    //Local variable cannot be static-

    //These are the Instance variables
    String name = "poonam";
    int age = 28;

    public static void main(String[] args) {
        Lab026_LocalVariables Lv = new Lab026_LocalVariables();
        Lv.displayInfo();
    }


    public void displayInfo() {
        // Local variable
        String company = "InfoBeans";  // only accessible inside this method

        //static int a = 10;   //we cant create static var inside non sstatic method
        System.out.println(name + " is " + age + " years old and works at " + company);
    }
}
