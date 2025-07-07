package Tasks.Task_8June_OOps.Hirarchical.RealAutomation;

public class TestRunnerClass {
    public static void main(String[] args) {
        //Login Test
        LoginTest login = new LoginTest();
        login.OpenBrowser();
        login.verifyLogin();
        login.closeBrowser();

        System.out.println();

        //searchTest
        SearchTest search = new SearchTest();
        search.OpenBrowser();
        search.verifySearch();
        search.closeBrowser();
    }
}
