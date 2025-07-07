package Tasks.Task_8June_OOps.Multilevel;

import java.sql.SQLOutput;

public class TestBase extends TestEnvironment{

    void setup(){
        System.out.println("Setting up URL and other Simulate browser launching -> I am parent extending TestEnv" );
    }

    void tearDown(){
        System.out.println("Closing browser");
    }
}
