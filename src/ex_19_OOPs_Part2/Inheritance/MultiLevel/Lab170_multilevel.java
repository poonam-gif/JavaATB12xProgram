package ex_19_OOPs_Part2.Inheritance.MultiLevel;

public class Lab170_multilevel {
    public static void main(String[] args) {

        //Son can access fathers methods as well as Grandfathers methods
        Son raj = new Son();
        raj.home();
        raj.gf();
        raj.newHome();

        //Father can access Granfathers methods
        Father sager = new Father();
        sager.gf();

        //GrandFather can Access own methods only.
        GrandFather gf = new GrandFather();

        Father f1 = new Son();   //possible as when son is getting born father is present -bortn in the sense sons ka obj create hote samay

       // Son ss = new Father();   //NOT possible as son is not present when father is born
    }
}
