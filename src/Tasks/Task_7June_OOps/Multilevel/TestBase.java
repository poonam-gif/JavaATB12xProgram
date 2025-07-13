package Tasks.Task_7June_OOps.Multilevel;

public class TestBase extends TestEnvironment{

    void setup(){
        System.out.println("Setting up URL and other Simulate browser launching -> I am parent extending TestEnv" );
    }

    void tearDown(){
        System.out.println("Closing browser");
    }
}
