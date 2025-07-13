package Tasks.Task_12June_Inheritance.ConstInheritance;

public class BaseTest {
  //  protected WebDriver driver;

    // Base constructor to set up driver
    public BaseTest() {
        System.out.println("BaseTest: Initializing WebDriver");
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        //driver = new ChromeDriver();
       // driver.manage().window().maximize();
    }
}
