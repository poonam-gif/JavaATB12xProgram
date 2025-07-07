package ex_18_OOPs_Constructor;

public class Lab165_InstanceVsLocalVar {
    String name ;   //Instance variable are defined at the class level ,outside any method. //initialization is not mandatory for the instance variables.

    void hello(){
        String name = "Poonam";  //Local variable - are block scoped created inside the function or method. // we have to assign the value to local var.

    }

    public static void main(String[] args) {


        //System.out.println("hello" +this.name);  // we cannot do this as this keyword is used to access global variablles inside the non static area.
                                                 //name is an instance variable we cannot cll this in static block -to call this we need to create object of class

        Lab165_InstanceVsLocalVar iv = new Lab165_InstanceVsLocalVar();
        iv.name="poonam";
        System.out.println(iv.name);

        iv.callName();
    }

    //or create a non static method and cal the varialb

    public void callName(){
        name = "vidya";
        System.out.println("my name is : " +name);
    }
}
//In your code, you're trying to access this.name from the main method:
//
//java
//Copy
//Edit
//System.out.println("hello" + this.name);
//But main() is declared as static, and this refers to the current object — which only exists in a non-static context.
//
//Also, name is an instance variable (non-static), which also can't be accessed directly from a static method like main().