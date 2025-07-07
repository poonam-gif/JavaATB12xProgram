package Assesments.SecondTest_22June;

public class Q1_PersonObjs {

    String name ;
    int age;

    Q1_PersonObjs(String name, int age){
             this.name = name;
             this.age = age;
         }

    void display(){
        System.out.println("Name:" +name+ " Age :" +age);
    }
    public static void main(String[] args) {
        Q1_PersonObjs p1= new Q1_PersonObjs("John" ,25);
        Q1_PersonObjs p2= new Q1_PersonObjs("Alice" ,30);

        p1.display();
        p2.display();

    }
}
