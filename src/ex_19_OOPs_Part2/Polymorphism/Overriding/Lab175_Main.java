package ex_19_OOPs_Part2.Polymorphism.Overriding;

public class Lab175_Main {

    public static void main(String[] args) {
        Father f = new Father();

        f.F1();
        f.Home();

        Daughter1 d = new Daughter1();
        d.Home();
        d.P1();

        //dynamic dispathc
        Father f2 = new Daughter1();
        f2.Home();
    }
}
