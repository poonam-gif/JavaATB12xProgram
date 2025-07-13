package Tasks.Task_7June_OOps.Hirarchical.EmployeeExample;

public class Tester extends Employee{

    Tester(int empId, String empName, String department) {
        super(empId, empName, department);
    }
    void performTesting(){
        System.out.println("Tester is executing test cases...");
    }
}
