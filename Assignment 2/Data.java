import java.util.*;

public class Data {
    static int calculateCharge(double data) {
        if (data <= 1) {
            return 50;
        } else if (data <= 5) {
            return 100;
        } else if (data <= 10) {
            return 200;
        } else {
            return 350;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long mobileNumber = sc.nextLong();
        double data = sc.nextDouble();

        if (data < 0) {
            System.out.println("Invalid data usage");
        } else {
            int charge = calculateCharge(data);

            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("Data Usage: " + data + " GB");
            System.out.println("Final Charge: " + charge);
        }

        sc.close();
    }
}