package Tasks.Task_8June_OOps.SingleInheritance;
//This is the real example of Single inheritance
//class User that has methods to store and display user details like name and email.
// Inherit this class in Customer class which adds mobile number and displays complete profile.

public class RealUserProfile {
    public static void main(String[] args) {
        Customer ct = new Customer();
        ct.displayDetails();
        System.out.println("number is :"+ct.number);
    }
}
