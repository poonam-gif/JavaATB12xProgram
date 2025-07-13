package Tasks.Task_12June_Inheritance.Overriding;

public class Daughter extends Mother{

    @Override
    void surname() {
        System.out.println("Daughter surname is PAPAT");
    }

    @Override
    void bunglow() {
        super.bunglow();
    }
}
