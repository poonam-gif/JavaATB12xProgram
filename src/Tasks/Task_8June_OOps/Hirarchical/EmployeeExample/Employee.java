package Tasks.Task_8June_OOps.Hirarchical.EmployeeExample;

public class Employee {

    private int EmpId;
   private String EmpName ;
    private String Dept ;

    Employee(int EmpId,String EmpName,String Dept){
        this.EmpId=EmpId;
        this.EmpName =EmpName;
        this.Dept =Dept;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee Id is :" +EmpId);
        System.out.println("Employee Name is: " +EmpName);
        System.out.println("Employee dept :" +Dept);
    }
}
