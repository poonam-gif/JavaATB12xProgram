package Assesments.Test_5July_WrapperClass;

public class AgeValidator {
    public static void main(String[] args) {
        int age = 15;

        try {
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }
}
