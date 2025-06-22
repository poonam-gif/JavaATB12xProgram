package SecondTest_22June;

public class Q2_Student {
    String name;
    int RollNo;
    char section;

    Q2_Student(String name,int RollNo,char section){
        this.name=name;
        this.RollNo=RollNo;
        this.section=section;
    }

    void display(){
        System.out.println("Student: " + name + ", Roll No: " + RollNo + ", Section: " + section);
    }

    public static void main(String[] args) {
        Q2_Student s =new Q2_Student("Bob", 101, 'A');

        s.display();

    }

}
