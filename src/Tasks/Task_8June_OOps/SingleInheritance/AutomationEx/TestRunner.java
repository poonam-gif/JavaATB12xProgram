package Tasks.Task_8June_OOps.SingleInheritance.AutomationEx;
//this is the main class for the searchTest
public class TestRunner {
    public static void main(String[] args) {
        SearchTest st = new SearchTest();
        st.Setup();
        st.log();
        st.verifySearchFunctionality();
        st.tearDown();

    }
}

//Problem Statement:
//Create a class TestBase which has setup and teardown methods.
// Create a class SearchTest which inherits from TestBase and adds a method verifySearchFunctionality()
// (all methods just print dummy actions to simulate automation flow).