package ex_02_JavaBasics_Part2;

public class Lab023_floatAndDouble {
    public static void main(String[] args) {
        float price1 = 10.123456f;     // 7 decimal digits max
        double price2 = 10.123456789012345;

        System.out.println("Float: " + price1);
        System.out.println("Double: " + price2);
    }

    //float is 4 byte andit need s suffix f e.g floaff = 3.44f;
    //double doens't need suffix and its of 8 bytes.

    //float and double are both used to store decimal numbers.
    // The main difference is in their precision and size — float uses 32 bits and can handle up to ~7 decimal digits,
    // while double uses 64 bits and supports up to ~15 digits.
    // Also, in Java, any decimal number is considered a double by default, so float values require an f suffix.
}
