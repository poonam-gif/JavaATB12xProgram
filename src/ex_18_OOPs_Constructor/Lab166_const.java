package ex_18_OOPs_Constructor;

public class Lab166_const {
    public static void main(String[] args) {
        Car2 Tiago = new Car2();   //here we havent passed anything so it will call default const

        // Print the values
        System.out.println("Model: " + Tiago.model);
        System.out.println("Year: " + Tiago.year);

        Car2 namo = new Car2("Nono22",2022); // here we are calling parameterized const
        System.out.println("Parameterized call : Model " +namo.model);
        System.out.println(namo.year);

    }

}
