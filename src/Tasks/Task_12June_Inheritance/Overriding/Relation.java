package Tasks.Task_12June_Inheritance.Overriding;

public class Relation {
    public static void main(String[] args) {
        //mothers obj

        Mother mother = new Mother();
        mother.surname();
        mother.bunglow();

        //Daughters obj

        Daughter daug = new Daughter();
        daug.surname();    //ovveriding the surnamehere
    }
}
