import java.util.*;

public class Bill {
    static double calculateBill(int units) {
        if (units <= 100) {
            return units * 2;
        } else if (units <= 200) {
            return units * 3;
        } else if (units <= 300) {
            return units * 5;
        } else {
            return units * 7;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();

        double bill = calculateBill(units);

        System.out.println("Electricity Bill: " + bill);

        sc.close();
    }
}