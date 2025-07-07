package ex_18_OOPs_Constructor;

public class Lab164_Car {
    public static void main(String[] args) {
        car tesla = new car();
        tesla.name="tesla";
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        car nano = new car();
        nano.name="nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);
    }
}
