package Tasks.Task_8June_OOps.Hirarchical.EmployeeExample;

public class MainClass {
    public static void main(String[] args) {
        Tester test = new Tester(101,"Kavya","QA");
        test.displayEmployeeDetails();
        test.performTesting();

        Developer Dev = new Developer(103,"rahul","Development");
        Dev.writeCode();
        Dev.displayEmployeeDetails();

    }

}
