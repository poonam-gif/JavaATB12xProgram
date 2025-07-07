package Assesments.SecondTest_22June;

public class Q5_AnimalSoundDemo {
    public static void main(String[] args) {
        Dog d =new Dog();
        Cat c =new Cat();

        d.makeSound();
        c.makeSound();
    }

}


class Animal {
     void makeSound(){
        System.out.println("Animal Sounds like ");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");

    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

//Animal Sound Polymorphism
//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
//
//Examples:
//Input:
//Create Dog and Cat objects and call makeSound()
//Output:
//Dog says: Woof! Woof! Cat says: Meow! Meow!
//💡 Explanation:Demonstrate method overriding where each subclass provides its own implementation of the makeSound() method.