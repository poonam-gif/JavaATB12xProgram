package ex_01_Java_Basics;

public class Lab003_No_Method {
    //In Java, the main() method is the entry point of any standalone Java application.
    // It’s where the program starts running.
    //if we don't have the main method ,the code does not execute

    public static void Show(){
        System.out.println("No main method here!");
    }
}

//Why is it important?
//Without a main() method, the Java Virtual Machine (JVM) doesn't know where to start running your code.
//It's mandatory in any console-based Java application.
//When you run your program, JVM looks for main() and executes the code inside it.