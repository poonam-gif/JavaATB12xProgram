package ex_02_JavaBasics_Part2;

public class Lab027_MultipleVariables {
    int a =89;
    public static void main(String[] args) {
        int a =20 , b= 2, c=23;

        System.out.printf("a =%d , b =%d,c=%d" ,a,b,c);
        System.out.println();
        Lab027_MultipleVariables mv = new Lab027_MultipleVariables();
        mv.enterNumbers();

    }
    void enterNumbers(){
        int a = 31;
        System.out.println("Local variable a ="+a);
        System.out.println("Instance var  a = " +this.a);
    }
}
