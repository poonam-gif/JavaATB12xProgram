package Tasks.Task_8June_OOps.SingleInheritance.AutomationEx;

public class TestBase {
    void Setup(){
        System.out.println("Setting Up commonly like Launching browser,Initialization navigation etc");
    }

    void log(){
        System.out.println("Browser is opened andi am logged in");
    }
    void tearDown(){
        System.out.println("Closing the browser");
    }
}
