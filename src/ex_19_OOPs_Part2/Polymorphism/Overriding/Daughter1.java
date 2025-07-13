package ex_19_OOPs_Part2.Polymorphism.Overriding;

public class Daughter1 extends Father {
    void P1(){
        System.out.println();
    }

    @Override
    void Home(){
        System.out.println("Daughter -Home 3BHK");
    }
}
