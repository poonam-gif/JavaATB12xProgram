package Tasks.Task_7June_OOps.Multilevel;

public class TestRunner {
    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.initializeEnvironment();       //method from granparent
        test.setup();                       //Parent method
        test.perfornLoginTest();           //own
        test.tearDown();                   //parent
    }

}
