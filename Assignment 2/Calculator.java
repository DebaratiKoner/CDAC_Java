import java.util.*;

public class Calculator {
    static double calculate(double a, double b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            if (b == 0) {
                return Double.NaN;
            }
            return a / b;
        } else {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        double result = calculate(a, b, op);

        if (Double.isNaN(result)) {
            System.out.println("Invalid operation or division by zero");
        } else {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}