package Tasks.Task_8June_OOps.SingleInheritance;

//This is the simple example of single inheritance where Animal is Parent and Sog is child class
//Dog inherits all the properties ofAnimal
public class Dog extends Animal{
    void displayBreed(){
        System.out.println("DogSounds: Bhu Bhu");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.displayBreed();
    }
}
