import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / (double) b));
            System.out.println("Remainder: " + (a % b));
        } else {
            System.out.println("Division by zero is not allowed");
        }

        sc.close();
    }
}