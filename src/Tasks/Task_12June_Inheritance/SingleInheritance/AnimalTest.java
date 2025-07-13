package Tasks.Task_12June_Inheritance.SingleInheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal generic = new Animal();       //parent obj

        //calling from Animal Class
        generic.Sound();

        Animal Dog = new Dog();             //child obj
        //calling from child class
        Dog.Sound();

        //dynamic dispatch

        Animal a= new Dog();       //child obj so calling child method
        a.Sound();
    }
}
