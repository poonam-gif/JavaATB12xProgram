package Tasks;

public class Task4_TriangleClassifier {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 5;
        int n3 = 5;

        // First, check if it's a valid triangle using triangle inequality
        if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
            if (n1 == n2 && n2 == n3) {
                System.out.println("The triangle is Equilateral.");
            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("Invalid triangle. The sides do not satisfy the triangle inequality.");
        }
    }
}
