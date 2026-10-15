import java.util.*;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        double amount = p + si;

        System.out.println("Simple Interest: " + si);
        System.out.println("Total Amount: " + amount);

        sc.close();
    }
}