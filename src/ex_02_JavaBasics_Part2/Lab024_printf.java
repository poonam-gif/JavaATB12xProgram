package ex_02_JavaBasics_Part2;

public class Lab024_printf {
    public static void main(String[] args) {
        int a = 3;

        System.out.printf("your variable is %d : " ,a);

        //%d - int ,byte short and long data type
        //%s - string
        //%b - boolean
        //%f - float

        //printf stands for Print Formatted , Supports formatting (%d, %s, etc.)
        //return type is PrintStream (can be chained)
        System.out.println();
        int age = 28;
        String name = "Poonam";
        System.out.printf("My name is %s and I am %d years old", name, age);
        System.out.println();
        System.out.printf("age = %d , name =%s" , age,name);
    }
}
