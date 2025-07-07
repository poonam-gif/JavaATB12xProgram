package ex_19_OOPs_Part2.Inheritance.Hirarchical;

public class Lab171_Hirarchical {
    public static void main(String[] args) {
        Raj raj = new Raj();
        raj.Name();
        raj.surName();   //extending from father
        raj.myProperty(); // my own
        raj.cityName();    //extending from father
        System.out.println("\n");

        Rushi rushi = new Rushi();
        rushi.Name();
        rushi.surName();
        rushi.cityName();
        rushi.Property();   //ovveriden by my own method in my class

        System.out.println("\n");
        Karan karan = new Karan();
        karan.Name();
        karan.surName();
        karan.Property();
    }
}
