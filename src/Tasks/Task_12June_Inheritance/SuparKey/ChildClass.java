package Tasks.Task_12June_Inheritance.SuparKey;

public class ChildClass extends ParentClass{

    @Override
    public void displayMessage() {
        super.displayMessage();   //using super keyword calling the parent method
        System.out.println("message from child classs");
    }
}
