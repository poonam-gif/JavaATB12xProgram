package Tasks.Task2TernaryOperators;

public class AgeCategory {

    public static void main(String[] args) {
        int age = 45;

        String category = (age <= 18)
                ? "Minor"
                : (age > 65)
                ? "Senior"
                : "Adult";

        System.out.println("You are a: " + category);
    }
}
