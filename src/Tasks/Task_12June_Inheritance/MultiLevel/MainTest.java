package Tasks.Task_12June_Inheritance.MultiLevel;

public class MainTest {
    public static void main(String[] args) {
        Child childObj = new Child();

        // Calling all inherited and own methods
        childObj.showGeneration();   // From Grandparent
        childObj.showParentRole();   // From Parent
        childObj.showChildRole();    // From Child
    }

}
