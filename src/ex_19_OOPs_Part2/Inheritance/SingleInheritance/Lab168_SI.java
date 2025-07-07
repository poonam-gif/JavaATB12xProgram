package ex_19_OOPs_Part2.Inheritance.SingleInheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son roy =new Son();
        System.out.println("Accessing fathers gold : " +roy.gold);
        roy.home();       //accessing method from father class
        roy.accessHome();   /// method from son class
    }
}
