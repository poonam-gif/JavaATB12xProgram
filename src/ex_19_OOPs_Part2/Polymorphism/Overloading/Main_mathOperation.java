package ex_19_OOPs_Part2.Polymorphism.Overloading;

public class Main_mathOperation {
    public static void main(String[] args) {
        Lab174_mathOperations mo = new Lab174_mathOperations();
        int result = mo.add(5,5);
        System.out.println(result);

        double res1 = mo.add(3.14,2.25);
        System.out.println(res1);

        int res2 = mo.add(5,6,8);
        System.out.println(res2);
    }
}
