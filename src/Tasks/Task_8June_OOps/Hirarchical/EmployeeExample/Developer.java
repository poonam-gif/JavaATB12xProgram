package Tasks.Task_8June_OOps.Hirarchical.EmployeeExample;

public class Developer extends Employee{

    Developer(int empId, String empName, String department) {
        super(empId, empName, department);
    }

    void writeCode(){
        System.out.println("Developer is writing a code ..");
    }
}
