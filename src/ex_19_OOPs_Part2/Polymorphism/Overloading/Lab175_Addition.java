package ex_19_OOPs_Part2.Polymorphism.Overloading;

public class Lab175_Addition {

    public static void main(String[] args) {
        Lab175_Addition a  = new Lab175_Addition();
        a.add(20,30);
        a.add(3.14,1.2);
        a.add("poonam",21);
    }

    void add (int a,int b){
        System.out.println(a+b);
    }

    void add (double a, double b){
        System.out.println(a+b);
    }

    void add (String a, double b){
        System.out.println(a+b);
    }
}
