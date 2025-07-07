package Assesments.SecondTest_22June;

public class Q3_Employee {
    private int id;
    private String name;
    private double salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Creating Employee object
        Q3_Employee emp =new Q3_Employee();

        // Setting values using setters
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000);

        // Getting values using getters and printing them
        System.out.println("Employee ID :" +emp.getId());
        System.out.println("Employee Name :" +emp.getName());
        System.out.println("Employee salary :" +emp.getSalary());

    }

}
