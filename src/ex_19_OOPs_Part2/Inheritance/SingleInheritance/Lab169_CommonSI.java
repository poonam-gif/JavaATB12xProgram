package ex_19_OOPs_Part2.Inheritance.SingleInheritance;

//Single Inheritance
public class Lab169_CommonSI {
    public static void main(String[] args) {
        TestCase1 ts1 = new TestCase1();
        ts1.open();
        ts1.openBrowser();
        ts1.closeBrowser();

        Testcase2 ts2 = new Testcase2();
        ts2.openBrowser();
        ts2.closeBrowser();
    }
}
