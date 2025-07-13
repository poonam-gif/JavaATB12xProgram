package Tasks.Task_7June_OOps.SingleInheritance.AutomationEx;

public class LoginTest extends BrowserUtility{
    void performLogin(){
        System.out.println("Logged in Successfully");
    }

    public static void main(String[] args) {
        LoginTest lt = new LoginTest();
        lt.openBrowser();
        lt.closeBrowser();
        lt.performLogin();
    }
}
//Create a base class BrowserUtility that has common reusable methods like openBrowser() and closeBrowser() (just simulate with print statements).
// Create a derived class LoginTest which uses these methods and adds its own method performLogin().