package Tasks.Task_12June_Inheritance.ConstInheritance;

public class LoginTest extends BaseTest{
    // Child constructor
    public LoginTest() {
        super(); // optional, auto-invoked
        System.out.println("🔐 LoginTest: Ready to perform login actions");
    }

    public void performLogin() {
      //  driver.get("https://example.com/login");
        // Perform login using driver.findElement(...).sendKeys(...);
        System.out.println("✅ Login successful!");
    }
}
